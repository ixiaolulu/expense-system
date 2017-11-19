package com.lulu.expense.web.controller;

import com.lulu.expense.model.request.FindAdminInfoRequest;
import com.lulu.expense.model.request.LoginRequest;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 14:21
 * @ModifiedBy:
 */
@Controller
@RequestMapping(value = "/expense/admin")
public class ExpenseAdminController {

    @Resource
    private ExpenseAdminService expenseAdminService;

    /**
     * 资费管理系统登录
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginRequest req, HttpServletRequest request) {
        return expenseAdminService.checkLogin(req, request);
    }

    /**
     * 管理员列表
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(FindAdminInfoRequest request, ModelMap map) {
        Pagination<Map<String, Object>> pagination = expenseAdminService.findAdminInfoList(request);
        map.addAttribute("pagination", pagination);
        return "admin/list";
    }

}
