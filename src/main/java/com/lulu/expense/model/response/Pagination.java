package com.lulu.expense.model.response;

import java.util.List;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 12:05
 * @ModifiedBy:
 */
public class Pagination<T> extends BaseResponse {

    private int totalCnt;

    private List<T> dataList;

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
