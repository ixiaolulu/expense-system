package com.lulu.expense.dao;

import com.lulu.expense.model.entity.ExpenseAdmin;
import org.springframework.stereotype.Repository;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:09
 * @ModifiedBy:
 */
@Repository
public class ExpenseAdminDao extends BaseDao {
    /**
     * 通过code获取Admin信息
     *
     * @param code
     * @return
     */
    public ExpenseAdmin getByCode(String code) {
        return readSqlSessionTemplate.selectOne("ExpenseAdminDao.getByCode", code);
    }
}
