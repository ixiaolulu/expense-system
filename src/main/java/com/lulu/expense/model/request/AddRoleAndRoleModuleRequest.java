package com.lulu.expense.model.request;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/12/2 14:11
 * @ModifiedBy:
 */
public class AddRoleAndRoleModuleRequest extends BaseRequest {
    /**
     * 模块Ids
     */
    private String[] moduleIds;
    /**
     * 角色名称
     */
    private String name;

    public String[] getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(String[] moduleIds) {
        this.moduleIds = moduleIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
