package com.campus.system.storage.filter;


import com.campus.system.storage_annotation.property.Property;

import java.util.Date;

/**
 * Created by lj88868 on 2016/6/8.
 */
public class BetweenFilter extends IFilter{
    private Property key;
    private Object mLeft;
    private Object mRight;

    public BetweenFilter(Property key, int left, int right) {
        this.tag = "between";
        this.key = key;
        this.mLeft = left;
        this.mRight = right;
    }

    public BetweenFilter(Property key, long left, long right) {
        this.tag = "between";
        this.key = key;
        this.mLeft = left;
        this.mRight = right;
    }

    public BetweenFilter(Property key, double left, double right) {
        this.tag = "between";
        this.key = key;
        this.mLeft = left;
        this.mRight = right;
    }

    public BetweenFilter(Property key, float left, float right) {
        this.tag = "between";
        this.key = key;
        this.mLeft = left;
        this.mRight = right;
    }

    public BetweenFilter(Property key, Date left, Date right) {
        this.tag = "between";
        this.key = key;
        this.mLeft = left;
        this.mRight = right;
    }

    public Property getKey() {
        return key;
    }

    public Object getLeft() {
        return mLeft;
    }

    public Object getRight() {
        return mRight;
    }
}
