package com.lulu.expense.service;

import com.lulu.expense.model.ApiResponse;
import com.lulu.expense.model.request.LoginRequest;

/**
 * @Author: Milo Ting
 * @Description: 资费管理系统登录服务类
 * @Date: 2017/11/4 19:05
 * @ModifiedBy:
 */
public interface AdminService {
    /**
     * 校验管理员登录
     *
     * @param req
     */
    ApiResponse checkLogin(LoginRequest req);
}
