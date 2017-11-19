package com.lulu.expense.model.entity;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 16:02
 * @ModifiedBy:
 */
public class ExpenseRole extends BaseModel {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 创建时间
     */
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
