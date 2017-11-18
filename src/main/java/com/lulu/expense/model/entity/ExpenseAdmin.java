package com.lulu.expense.model.entity;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description: 管理员类
 * @Date: 2017/11/4 19:52
 * @ModifiedBy:
 */
public class ExpenseAdmin extends BaseModel {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 登录码
     */
    private String code;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 授权日期
     */
    private Date enrollDate;

    /**
     * 创建时间
     */
    private Date timeCreated;

    /**
     * 修改时间
     */
    private Date timeModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }
}
