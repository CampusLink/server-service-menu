package com.campus.system.storage.filter;


import java.util.List;

/**
 * Created by lj88868 on 2016/6/8.
 */
public class NotContainedInFilter extends IFilter{
    private String key;
    private List value;

    public NotContainedInFilter(String key, List value) {
        this.tag = "not in";
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public List getValue() {
        return value;
    }
}
