package com.lulu.expense.service.impl;

import com.lulu.expense.dao.ExpenseModuleDao;
import com.lulu.expense.model.entity.ExpenseModule;
import com.lulu.expense.service.ExpenseModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 13:17
 * @ModifiedBy:
 */
@Service
public class ExpenseModuleServiceImpl implements ExpenseModuleService {
    @Autowired
    private ExpenseModuleDao expenseModuleDao;

    public List<ExpenseModule> getAllExpenseModules() {
        return expenseModuleDao.getAllExpenseModules();
    }
}
