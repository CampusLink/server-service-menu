package com.campus.system.storage.filter;


/**
 * Created by lj88868 on 2016/6/8.
 */
public class NotEqualToFilter extends IFilter{
    private String key;
    private Object value;

    public NotEqualToFilter(String key, Object value) {
        this.tag = "!=";
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
