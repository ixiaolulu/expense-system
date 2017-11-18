package com.lulu.expense.utils;


import com.lulu.expense.model.entity.ExpenseAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/18 18:15
 * @ModifiedBy:
 */
public class HttpServletUtils {
    /**
     * init session, devide the session to two section SDS and TDS
     *
     * @param request request
     * @return boolean
     */
    public static HttpSession init(HttpServletRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("request is null!");
        }
        //request.getSession(true)：若存在会话则返回该会话，否则新建一个会话。
        //request.getSession(false)：若存在会话则返回该会话，否则返回NULL
        HttpSession session = request.getSession(false);

        return session;
    }

    /**
     * 把登录信息放到session里
     *
     * @param request
     * @param expenseAdmin
     * @return
     */
    public static HttpSession init(HttpServletRequest request, ExpenseAdmin expenseAdmin) {
        HttpSession session = init(request);
        if (session != null) {
            session.setAttribute("userInfo", expenseAdmin);
        }
        return session;
    }
}
