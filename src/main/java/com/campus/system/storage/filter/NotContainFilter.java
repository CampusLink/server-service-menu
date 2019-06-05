package com.campus.system.storage.filter;


/**
 * Created by lj88868 on 2016/6/8.
 */
public class NotContainFilter extends IFilter{
    private String key;
    private Object value;

    public NotContainFilter(String key, Object value) {
        this.tag = "!like";
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
