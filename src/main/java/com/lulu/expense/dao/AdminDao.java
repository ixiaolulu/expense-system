package com.lulu.expense.dao;

import com.lulu.expense.model.data.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:09
 * @ModifiedBy:
 */
public interface AdminDao{
    /**
     * 通过code获取管理员信息
     *
     * @return
     */
    Admin getByCode(String code);
}
