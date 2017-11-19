package com.lulu.expense.service.impl;

import com.lulu.expense.dao.ExpenseRoleDao;
import com.lulu.expense.model.entity.ExpenseRole;
import com.lulu.expense.model.request.FindRoleRequest;
import com.lulu.expense.model.response.Pagination;
import com.lulu.expense.service.ExpenseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 查询角色列表
     *
     * @return
     */
    public Pagination<Map<String, Object>> findRoleList(FindRoleRequest req) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("offset", req.getOffset());
        paramMap.put("rowsPerPage", req.getRowsPerPage());
        int totalCnt = expenseRoleDao.selectListPageCount(paramMap);
        List<Map<String, Object>> dataList = expenseRoleDao.selectListPage(paramMap);
        Pagination<Map<String, Object>> pagination = new Pagination<Map<String, Object>>();
        pagination.setTotalCnt(totalCnt);
        pagination.setDataList(dataList);
        return pagination;
    }
}
