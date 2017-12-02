package com.lulu.expense.model.entity;

import com.lulu.expense.dao.BaseDao;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 13:11
 * @ModifiedBy:
 */
public class ExpenseModule extends BaseModel {

    private String name;

    private Date timeCreated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
