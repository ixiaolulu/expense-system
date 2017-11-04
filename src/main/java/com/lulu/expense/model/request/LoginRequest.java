package com.lulu.expense.model.request;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/4 20:01
 * @ModifiedBy:
 */
public class LoginRequest extends BaseRequest {
    /**
     * 登录码
     */
    private String code;

    /**
     * 密码
     */
    private String password;

    /**
     * 验证码
     */
    private String validateCode;

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

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
