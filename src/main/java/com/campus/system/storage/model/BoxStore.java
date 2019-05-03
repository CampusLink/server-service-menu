package com.campus.system.storage.model;

import java.util.List;

//此对象映射数据库
public abstract class BoxStore {
    private String mStoreName;
    private String mUserName;
    private String mPassword;
    private List<Box> mBoxes;

    public abstract <E extends BoxObj> Box<E> boxFor(Class<E> clazz);
}
