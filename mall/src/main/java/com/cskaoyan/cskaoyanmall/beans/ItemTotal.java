package com.cskaoyan.cskaoyanmall.beans;

public class ItemTotal {
    private Object items;

    private long total;

    public ItemTotal(Object items, long total) {
        this.items = items;
        this.total = total;
    }

    public Object getItems() {
        return items;
    }

    public void setItems(Object items) {
        this.items = items;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
