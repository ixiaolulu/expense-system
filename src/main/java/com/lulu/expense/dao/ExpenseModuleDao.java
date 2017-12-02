package com.lulu.expense.dao;

import com.lulu.expense.model.entity.ExpenseModule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 13:10
 * @ModifiedBy:
 */
@Repository
public class ExpenseModuleDao extends BaseDao {

    public int add(ExpenseModule module) {
        return writeSqlSessionTemplate.insert("ExpenseModuleDao.add", module);
    }

    public List<ExpenseModule> getAllExpenseModules() {
        return writeSqlSessionTemplate.selectList("ExpenseModuleDao.getAllExpenseModules");
    }
}
