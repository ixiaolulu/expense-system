package com.lulu.expense.dao;

import com.lulu.expense.model.entity.ExpenseModule;
import com.lulu.expense.model.entity.ExpenseRoleModule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 14:26
 * @ModifiedBy:
 */
@Repository
public class ExpenseRoleModuleDao extends BaseDao {
    public int add(ExpenseRoleModule roleModule) {
        return writeSqlSessionTemplate.insert("ExpenseRoleModuleDao.add", roleModule);
    }

    public int batchAdd(List<ExpenseRoleModule> roleModuleList) {
        return writeSqlSessionTemplate.insert("ExpenseRoleModuleDao.batchAdd", roleModuleList);
    }

}
