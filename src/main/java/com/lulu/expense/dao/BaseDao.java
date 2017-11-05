package com.lulu.expense.dao;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/5 13:40
 * @ModifiedBy:
 */
public class BaseDao {
    @Resource
    public SqlSessionTemplate sqlSessionTemplate;
}
