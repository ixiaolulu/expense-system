package com.lulu.expense.model.entity;

import java.io.Serializable;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/18 20:42
 * @ModifiedBy:
 */
public class BaseModel implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
