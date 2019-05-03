package com.campus.system.storage.filter;


/**
 * Created by lj88868 on 2016/6/8.
 */
public class EndWithFilter extends IFilter{
    private String key;
    private Object value;

    public EndWithFilter(String key, Object value) {
        this.tag = "endWith";
        this.key = key;
        this.value = value;
    }

}
