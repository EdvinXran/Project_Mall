package com.cskaoyan.mall.beans;


import java.util.List;

/**
 * @Author: Suzie Liao
 * @Date: 2019-05-23 19:24
 */
public class TotalAndItems<T> {
    private int total;
    private List<T> items;

    public TotalAndItems() {
    }

    public TotalAndItems(int total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "TotalAndItems{" +
                "total=" + total +
                ", items=" + items +
                '}';
    }
}
