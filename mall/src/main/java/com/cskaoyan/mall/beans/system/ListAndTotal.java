package com.cskaoyan.mall.beans.system;

import java.util.List;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 19:56
 */
public class ListAndTotal<T> {
    private List<T> items;
    private int total;

    public ListAndTotal() {
    }

    public ListAndTotal(List<T> items, int total) {
        this.items = items;
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> list) {
        this.items = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ListAndTotal{" +
                "items=" + items+
                ", total='" + total + '\'' +
                '}';
    }
}
