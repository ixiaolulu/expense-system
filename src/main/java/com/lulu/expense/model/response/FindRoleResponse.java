package com.lulu.expense.model.response;

import com.lulu.expense.utils.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/3 21:31
 * @ModifiedBy:
 */
public class FindRoleResponse extends BaseResponse {

    private Integer id;

    private Integer moduleId;

    private String moduleNameStr = "";

    private String name = "";

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date timeCreated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleNameStr() {
        return moduleNameStr;
    }

    public void setModuleNameStr(String moduleNameStr) {
        this.moduleNameStr = moduleNameStr;
    }

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
