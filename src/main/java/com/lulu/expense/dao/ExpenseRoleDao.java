package com.lulu.expense.dao;

import com.lulu.expense.model.entity.ExpenseRole;
import com.lulu.expense.model.response.FindRoleResponse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 16:14
 * @ModifiedBy:
 */
@Repository
public class ExpenseRoleDao extends BaseDao {

    public int add(ExpenseRole role) {
        return writeSqlSessionTemplate.insert("ExpenseRoleDao.add", role);
    }


    public ExpenseRole getByName(String name) {
        return writeSqlSessionTemplate.selectOne("ExpenseRoleDao.getByName", name);
    }
    /**
     * 总数
     *
     * @param paramMap
     * @return
     */
    public int selectListPageCount(Map<String, Object> paramMap) {
        return readSqlSessionTemplate.selectOne("ExpenseRoleDao.selectListPageCount", paramMap);
    }


    /**
     * 列表
     *
     * @param paramMap
     * @return
     */
    public List<FindRoleResponse> selectListPage(Map<String, Object> paramMap) {
        return readSqlSessionTemplate.selectList("ExpenseRoleDao.selectListPage", paramMap);
    }

}
