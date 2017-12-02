package com.lulu.expense.model.entity;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 14:27
 * @ModifiedBy:
 */
public class ExpenseRoleModule extends BaseModel {

    private Integer roleId;

    private Integer moduleId;

    private Date timeCreated;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
