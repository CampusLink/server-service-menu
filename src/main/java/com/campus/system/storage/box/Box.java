package com.campus.system.storage.box;


import com.campus.system.storage.ResultSet.ResultSet;
import com.campus.system.storage_annotation.property.Id;
import com.campus.system.storage_annotation.property.Property;

import java.util.List;

//此对象映射数据库表
public class Box<T> {
    private String mTableName;
    private Class mEnityClass;
    private EnityCursor<T> mEnityCursor;
    private List<Property> mProperties;
    private BoxStore mBoxStore;

    protected Box(EnityCursor enityCursor, BoxStore boxStore) {
        init(enityCursor, boxStore);
    }

    public void init(EnityCursor enityCursor, BoxStore boxStore) {
        mEnityCursor = enityCursor;
        mEnityClass = enityCursor.mEnityClass;
        mBoxStore = boxStore;
        mTableName = enityCursor.mTableName;
        mProperties = enityCursor.mProperties;
    }

    public T save(T t) {
        return mBoxStore.getEngine().save(t, this, mBoxStore.getPool());
    }

    public T remove(T t) {
        return mBoxStore.getEngine().remove(t, this, mBoxStore.getPool());
    }

    public T update(T t){
        return mBoxStore.getEngine().update(t, this, mBoxStore.getPool());
    }

    public List<T> find(BoxQuery query){
        return mBoxStore.getEngine().find(query, this, mBoxStore.getPool());
    }

    public T get(Id id){
        return mBoxStore.getEngine().get(id, this, mBoxStore.getPool());
    }

    public String getName() {
        return mTableName;
    }

    public BoxQuery obtainQuery(){
        return new BoxQuery(this);
    }

    protected List<T> query(BoxQuery query){
        return mBoxStore.getEngine().find(query, this, mBoxStore.getPool());
    }

    public Class getEnityClass() {
        return mEnityClass;
    }

    public List<Property> getProperties() {
        return mProperties;
    }

    public BoxStore getBoxStore() {
        return mBoxStore;
    }

    public String getTableName() {
        return mTableName;
    }

    public List<T> parseResult(ResultSet resultSet, List<Property> keys) throws Exception {
        return mEnityCursor.parseResult(resultSet, keys);
    }
}
