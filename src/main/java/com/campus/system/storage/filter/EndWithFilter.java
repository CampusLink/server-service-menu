package com.campus.system.storage.filter;


/**
 * Created by lj88868 on 2016/6/8.
 */
public class EndWithFilter extends IFilter{
    private String key;
    private String value;

    public EndWithFilter(String key, String value) {
        this.tag = "endWith";
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
