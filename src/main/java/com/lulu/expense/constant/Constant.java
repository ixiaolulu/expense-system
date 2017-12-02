package com.lulu.expense.constant;

/**
 * @Author: Milo Ting
 * @Description: 错误码处理类
 * @Date: 2017/11/4 19:09
 * @ModifiedBy:
 */
public class Constant {

    /**
     * --------------static string----------------------
     **/

    public static final String LOGIN_ACTION = "forward:/";

    public static final String INDEX_ACTION = "index";

    public static final String CODE_ERROR = "code_error";

    public static final String PASSWORD_ERROR = "password_error";

    public static final String VALIDATECODE_ERROR = "validateCode_error";

    public static final String CODEORPWD_ERROR = "codeOrPwd_error";
    public static final String CODE_ERROR_NOT_NULL_MSG = "账号不能为空";
    public static final String PASSWORD_ERROR_NOT_NULL_MSG = "密码不能为空";
    public static final String VALIDATECODE_NOT_NULL_ERROR_MSG = "验证码不能为空";
    public static final String VALIDATECODE_ERROR_MSG = "验证码错误";
    public static final String CODEORPWD_ERROR_MSG = "账号或者密码错误";
    public static final String ROLENAME_ALREADY_EXIST_ERROR_MSG = "保存失败，角色名称重复！";
    public static final String SAVE_SUCCESS_MSG = "保存成功！";
    /**--------------code----------------------**/
    public static final int SUCCESS = 0;
    public static final int ROLENAME_ALREADY_EXIST_ERROR = 1;
    /**--------------msg----------------------**/
    public static String SUCCESS_MSG = "OK";



}
