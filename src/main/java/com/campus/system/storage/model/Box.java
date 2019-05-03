package com.campus.system.storage.model;

import java.util.List;

//此对象映射数据库表
public abstract class Box<T extends BoxObj> {
    private String mName;
    private int mVersion;
    private Transaction mTransaction;

    public Box(String name, int version) {
        mName = name;
        mVersion = version;
    }

    public BoxQuery<T> obtainQuery(){
        return new BoxQuery<T>(this, mName);
    }

    protected abstract List<T> query(BoxQuery query);

    protected abstract void queryInBackground(BoxQuery query, BoxQuery.BoxQueryListener<T> listener);

    public abstract void put(T... t);

    public abstract void delete(T... t);

    public abstract void delete(long id);

    public abstract T get(long id);

    public Transaction beginTX(){
        mTransaction = new Transaction(this);
        return mTransaction;
    }
}
