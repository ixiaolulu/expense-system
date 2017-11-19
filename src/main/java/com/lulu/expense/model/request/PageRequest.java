package com.lulu.expense.model.request;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/11/19 10:49
 * @ModifiedBy:
 */
public class PageRequest extends BaseRequest {

    /**
     * 第几页
     */
    private Integer page = 1;

    /**
     * 每页的大小
     */
    private Integer rowsPerPage = 10;

    /**
     * 查询的起始值
     */
    private Integer offset = (this.getPage() - 1) * this.getRowsPerPage();

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    public void setRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
