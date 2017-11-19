package com.lulu.expense.model.entity;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description: 管理员角色关联信息
 * @Date: 2017/11/18 21:22
 * @ModifiedBy:
 */
public class ExpenseAdminRole extends BaseModel {

    /**
     * 管理员id
     */
    private Integer adminId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 创建对象
     */
    private Date timeCreated;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
