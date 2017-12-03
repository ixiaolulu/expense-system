package com.lulu.expense.web.controller;

import com.lulu.expense.model.entity.ExpenseModule;
import com.lulu.expense.model.request.AddRoleAndRoleModuleRequest;
import com.lulu.expense.model.request.FindRoleRequest;
import com.lulu.expense.model.response.ApiResponse;
import com.lulu.expense.model.response.FindRoleResponse;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseModuleService;
import com.lulu.expense.service.ExpenseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private ExpenseModuleService expenseModuleService;

    /**
     * 角色列表
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(FindRoleRequest request, ModelMap map) {
        Pagination<FindRoleResponse> pagination = expenseRoleService.findRoleList(request);
        map.addAttribute("pagination", pagination);
        return "role/list";
    }

    /**
     * 查询角色列表
     *
     * @return
     */
    @RequestMapping(value = "/queryList")
    public @ResponseBody
    ApiResponse queryList(FindRoleRequest request) {
        Pagination<FindRoleResponse> pagination = expenseRoleService.findRoleList(request);
        return ApiResponse.success(pagination);
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, ModelMap modelMap) {
        List<ExpenseModule> moduleList = expenseModuleService.getAllExpenseModules();
        modelMap.put("moduleList", moduleList);
        return "role/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse save(AddRoleAndRoleModuleRequest request) {
        return expenseRoleService.saveRoleAndRoleModule(request);
    }
}
