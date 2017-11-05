package com.lulu.expense.dao.impl;

import com.lulu.expense.dao.AdminDao;
import com.lulu.expense.dao.BaseDao;
import com.lulu.expense.model.data.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:23
 * @ModifiedBy:
 */
@Repository
public class AdminDaoImpl extends BaseDao implements AdminDao {

    /**
     * 通过code获取Admin信息
     *
     * @param code
     * @return
     */
    public Admin getByCode(String code) {
        return sqlSessionTemplate.selectOne("admin.getByCode", code);
    }
}
