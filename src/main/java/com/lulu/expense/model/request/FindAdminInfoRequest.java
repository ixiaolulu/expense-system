package com.lulu.expense.model.request;

import com.lulu.expense.model.response.BaseResponse;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/18 21:58
 * @ModifiedBy:
 */
public class FindAdminInfoRequest extends PageRequest {

    /**
     * 模块id
     */
    private Integer moduleId;

    /**
     * 角色名称
     */
    private String roleName;


    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
