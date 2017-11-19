package com.lulu.expense.service.impl;

import com.lulu.expense.constant.Constant;
import com.lulu.expense.dao.ExpenseAdminDao;
import com.lulu.expense.model.entity.ExpenseAdmin;
import com.lulu.expense.model.request.FindAdminInfoRequest;
import com.lulu.expense.model.request.LoginRequest;
import com.lulu.expense.model.response.AdminInfo;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseAdminService;
import com.lulu.expense.utils.HttpServletUtils;
import com.lulu.expense.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:06
 * @ModifiedBy:
 */
@Service
public class ExpenseAdminServiceImpl implements ExpenseAdminService {

    @Resource
    private ExpenseAdminDao expenseAdminDao;

    /**
     * 管理员登录
     *
     * @param req
     */
    public String checkLogin(LoginRequest req, HttpServletRequest request) {

        //账号不能为空
        if (StringUtils.isEmpty(req.getCode())) {
            request.setAttribute(Constant.CODE_ERROR, Constant.CODE_ERROR_NOT_NULL_MSG);
            return Constant.LOGIN_ACTION;
        }

        //密码不能为空
        if (StringUtils.isEmpty(req.getPassword())) {
            request.setAttribute(Constant.PASSWORD_ERROR, Constant.PASSWORD_ERROR_NOT_NULL_MSG);
            return Constant.LOGIN_ACTION;
        }

        //校验验证码
        String vaCode = req.getValidateCode();
        if (StringUtils.isEmpty(vaCode)) {
            request.setAttribute(Constant.VALIDATECODE_ERROR, Constant.VALIDATECODE_NOT_NULL_ERROR_MSG);
            return Constant.LOGIN_ACTION;
        } else {
//            String validateCode = (String) request.getSession().getAttribute("validateCode");
//            if(!vaCode.equals(validateCode)){
//                request.setAttribute("validateCode_error","验证码错误！");
//                return LOGIN_ACTION;
//            }
        }
        //校验账号和密码是否正确
        ExpenseAdmin expenseAdmin = expenseAdminDao.getByCode(req.getCode());

        if (expenseAdmin == null || !expenseAdmin.getCode().equals(req.getCode()) || !expenseAdmin.getPassword().equals(req.getPassword())) {
            request.setAttribute(Constant.CODEORPWD_ERROR, Constant.CODEORPWD_ERROR_MSG);
            return Constant.LOGIN_ACTION;
        } else {
            //把用户信息放到session里
            HttpServletUtils.init(request, expenseAdmin);
        }
        return Constant.INDEX_ACTION;
    }

    /**
     * 获取管理员列表
     *
     * @param req
     * @return
     */
    public Pagination<Map<String, Object>> findAdminInfoList(FindAdminInfoRequest req) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roleName", req.getRoleName());
        paramMap.put("offset", req.getOffset());
        paramMap.put("rowsPerPage", req.getRowsPerPage());
        int totalCnt = expenseAdminDao.selectListPageCount(paramMap);
        List<Map<String, Object>> dataList = expenseAdminDao.selectListPage(paramMap);
        Pagination<Map<String, Object>> pagination = new Pagination<Map<String, Object>>();
        pagination.setTotalCnt(totalCnt);
        pagination.setDataList(dataList);
        return pagination;
    }
}
