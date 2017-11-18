package com.lulu.expense.utils;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/18 18:06
 * @ModifiedBy:
 */
public class StringUtils {
    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }

}
