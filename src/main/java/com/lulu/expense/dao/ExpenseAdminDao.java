package com.lulu.expense.dao;

import com.lulu.expense.model.entity.ExpenseAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    /**
     * 总数
     *
     * @param paramMap
     * @return
     */
    public int selectListPageCount(Map<String, Object> paramMap) {
        return readSqlSessionTemplate.selectOne("ExpenseAdminDao.selectListPageCount", paramMap);
    }


    /**
     * 列表
     *
     * @param paramMap
     * @return
     */
    public List<Map<String, Object>> selectListPage(Map<String, Object> paramMap) {
        return readSqlSessionTemplate.selectList("ExpenseAdminDao.selectListPage", paramMap);
    }

}
