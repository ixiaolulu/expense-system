package com.lulu.expense.dao;

import com.lulu.expense.model.data.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:09
 * @ModifiedBy:
 */
@Repository
public class AdminDao extends BaseDao{
    /**
     * 通过code获取Admin信息
     *
     * @param code
     * @return
     */
    public Admin getByCode(String code) {
        return readSqlSessionTemplate.selectOne("admin.getByCode", code);
    }
}
