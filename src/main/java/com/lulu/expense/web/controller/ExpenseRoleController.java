package com.lulu.expense.web.controller;

import com.lulu.expense.model.entity.ExpenseRole;
import com.lulu.expense.model.request.FindRoleRequest;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 16:00
 * @ModifiedBy:
 */
@Controller
@RequestMapping("/expense/role")
public class ExpenseRoleController {
    @Autowired
    private ExpenseRoleService expenseRoleService;

    /**
     * 角色列表
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(FindRoleRequest request, ModelMap map) {
        Pagination<Map<String, Object>> pagination = expenseRoleService.findRoleList(request);
        map.addAttribute("pagination", pagination);
        return "role/list";
    }
}
