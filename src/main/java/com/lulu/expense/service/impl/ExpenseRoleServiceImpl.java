package com.lulu.expense.service.impl;

import com.lulu.expense.constant.Constant;
import com.lulu.expense.dao.ExpenseRoleDao;
import com.lulu.expense.dao.ExpenseRoleModuleDao;
import com.lulu.expense.model.entity.ExpenseRole;
import com.lulu.expense.model.entity.ExpenseRoleModule;
import com.lulu.expense.model.request.AddRoleAndRoleModuleRequest;
import com.lulu.expense.model.request.FindRoleRequest;
import com.lulu.expense.model.response.ApiResponse;
import com.lulu.expense.model.response.FindRoleResponse;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Role;
import java.util.*;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 16:07
 * @ModifiedBy:
 */
@Service
public class ExpenseRoleServiceImpl implements ExpenseRoleService {

    @Autowired
    private ExpenseRoleDao expenseRoleDao;

    @Autowired
    private ExpenseRoleModuleDao expenseRoleModuleDao;

    /**
     * 查询角色列表
     *
     * @return
     */
    public Pagination<FindRoleResponse> findRoleList(FindRoleRequest req) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("offset", (req.getPage() - 1) * req.getRowsPerPage());
        paramMap.put("rowsPerPage", req.getRowsPerPage());
        int totalCnt = expenseRoleDao.selectListPageCount(paramMap);
        List<FindRoleResponse> dataList = expenseRoleDao.selectListPage(paramMap);
        Pagination<FindRoleResponse> pagination = new Pagination<FindRoleResponse>();
        pagination.setTotalCnt(totalCnt);
        pagination.setDataList(dataList);
        return pagination;
    }

    @Transactional
    public ApiResponse saveRoleAndRoleModule(AddRoleAndRoleModuleRequest request) {
        ApiResponse response = new ApiResponse(Constant.SUCCESS, Constant.SAVE_SUCCESS_MSG, null);
        ExpenseRole existRole = expenseRoleDao.getByName(request.getName());
        if (existRole != null) {
            response.setCode(Constant.ROLENAME_ALREADY_EXIST_ERROR);
            response.setMsg(Constant.ROLENAME_ALREADY_EXIST_ERROR_MSG);
            return response;
        }

        //新增角色
        ExpenseRole role = new ExpenseRole();
        role.setName(request.getName());
        role.setTimeCreated(new Date());
        expenseRoleDao.add(role);

        //关联所有角色权限
        String[] moduleIds = request.getModuleIds();
        if (moduleIds != null && moduleIds.length > 0) {
            List<ExpenseRoleModule> roleModuleList = new ArrayList<ExpenseRoleModule>();
            for (String moduleId : moduleIds) {
                ExpenseRoleModule roleModule = new ExpenseRoleModule();
                roleModule.setModuleId(Integer.valueOf(moduleId));
                roleModule.setRoleId(role.getId());
                roleModule.setTimeCreated(new Date());
                roleModuleList.add(roleModule);
            }
            //保存角色权限
            expenseRoleModuleDao.batchAdd(roleModuleList);
        }
        return response;
    }
}
