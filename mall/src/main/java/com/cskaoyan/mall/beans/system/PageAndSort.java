package com.cskaoyan.mall.beans.system;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 17:38
 */
public class PageAndSort {
    private int page;
    private int limit;
    private String sort;
    private String order;

    public PageAndSort() {
    }

    public PageAndSort(int page, int limit, String sort, String order) {
        this.page = page;
        this.limit = limit;
        this.sort = sort;
        this.order = order;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "PageAndSort{" +
                "page=" + page +
                ", limit=" + limit +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
