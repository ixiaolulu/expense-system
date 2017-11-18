package com.lulu.expense.model.response;

import com.lulu.expense.constant.Constant;

import java.io.Serializable;

/**
 * @Author: Milo Ting
 * @Description: 统一返回对象
 * @Date: 2017/11/4 19:02
 * @ModifiedBy:
 */
public class ApiResponse implements Serializable {
    private int code;
    private String msg;
    private Object data;

    /**
     * 返回成功对象
     *
     * @param data
     * @return
     */
    public static ApiResponse success(Object data) {
        ApiResponse resp = new ApiResponse();
        resp.setCode(Constant.SUCCESS);
        resp.setMsg(Constant.SUCCESS_MSG);
        resp.setData(data);
        return resp;
    }

    /**
     * 失败返回对象
     *
     * @param errorCode
     * @param errorMsg
     * @return
     */
    public static ApiResponse fail(int errorCode, String errorMsg) {
        ApiResponse resp = new ApiResponse();
        resp.setCode(errorCode);
        resp.setMsg(errorMsg);
        return resp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
