package com.lulu.expense.service;

import com.lulu.expense.model.request.FindAdminInfoRequest;
import com.lulu.expense.model.request.LoginRequest;
import com.lulu.expense.model.response.AdminInfo;
import com.lulu.expense.model.response.Pagination;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author: Milo Ting
 * @Description: 资费管理系统登录服务类
 * @Date: 2017/11/4 19:05
 * @ModifiedBy:
 */
public interface ExpenseAdminService {

    /**
     * 管理员登录
     *
     * @param req
     * @param request
     * @return
     */
    String checkLogin(LoginRequest req, HttpServletRequest request);

    /**
     * 获取管理员列表
     *
     * @param req
     * @return
     */
    Pagination<Map<String, Object>> findAdminInfoList(FindAdminInfoRequest req);
}
