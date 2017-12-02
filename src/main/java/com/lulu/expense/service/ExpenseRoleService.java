package com.lulu.expense.service;

import com.lulu.expense.model.request.AddRoleAndRoleModuleRequest;
import com.lulu.expense.model.request.FindRoleRequest;
import com.lulu.expense.model.response.ApiResponse;
import com.lulu.expense.model.response.Pagination;

import java.util.Map;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 16:01
 * @ModifiedBy:
 */
public interface ExpenseRoleService {
    /**
     * 查询角色列表
     *
     * @return
     */
    Pagination<Map<String, Object>> findRoleList(FindRoleRequest request);

    /**
     * @param request
     * @return
     */
    ApiResponse saveRoleAndRoleModule(AddRoleAndRoleModuleRequest request);

}
