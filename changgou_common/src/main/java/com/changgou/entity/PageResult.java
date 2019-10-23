package com.changgou.entity;

import java.util.List;

/**
 * @ Author     ：SPF
 * @ Date       ：Created in 19:58 2019/8/9
 * @ Description：用于承载分页的数据结果
 * @ Modified By：
 * @Version : 1.0
 */
public class PageResult<T> {
    private Long total;//总记录数
    private List<T> rows;//记录

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }

    public Long getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
