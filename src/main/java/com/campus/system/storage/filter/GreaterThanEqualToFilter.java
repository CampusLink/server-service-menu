package com.campus.system.storage.filter;


/**
 * Created by lj88868 on 2016/6/8.
 */
public class GreaterThanEqualToFilter extends IFilter{
    private String key;
    private Object value;

    public GreaterThanEqualToFilter(String key, Object value) {
        this.tag = ">=";
        this.key = key;
        this.value = value;
    }

}