package com.campus.system.storage.filter;


import java.util.List;

/**
 * Created by lj88868 on 2016/6/8.
 */
public class ContainsFilter extends IFilter{
    private String key;
    private String value;

    public ContainsFilter(String key, String value) {
        this.tag = "like";
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
