package com.lulu.expense.service.impl;

import com.lulu.expense.dao.AdminDao;
import com.lulu.expense.model.ApiResponse;
import com.lulu.expense.model.request.LoginRequest;
import com.lulu.expense.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:06
 * @ModifiedBy:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;
    /**
     * 校验管理员登录
     * @param req
     */
    public ApiResponse checkLogin(LoginRequest req) {

       return ApiResponse.success(null);
    }
}
