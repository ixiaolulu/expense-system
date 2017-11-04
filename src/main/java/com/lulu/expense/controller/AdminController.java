package com.lulu.expense.controller;

import com.lulu.expense.model.ApiResponse;
import com.lulu.expense.model.request.LoginRequest;
import com.lulu.expense.service.AdminService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 14:21
 * @ModifiedBy:
 */
@Controller
@RequestMapping(value = "/admin",method= RequestMethod.POST)
public class AdminController {

    @Resource
    private AdminService adminService;

    /**
     * 资费管理系统登录
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public ApiResponse Login(LoginRequest req){
        return adminService.checkLogin(req);
    }

}
