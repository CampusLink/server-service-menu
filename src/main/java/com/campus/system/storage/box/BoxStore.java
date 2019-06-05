package com.campus.system.storage.box;

import com.campus.system.storage.connection.ConnectionPool;
import com.campus.system.storage.connection.PoolConfig;
import com.campus.system.storage.engine.Engine;
import com.campus.system.storage_annotation.processor.EnityProcessor;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

//此对象映射数据库
public abstract class BoxStore {
    private List<Box> mBoxs;
    private Engine mEngine;
    private ConnectionPool mPool;
    private HashMap<Class, Box> mBoxMenu;

    protected BoxStore(PoolConfig config, Engine engine) {
        mEngine = engine;
        mPool = withConfig(config);
        mEngine = engine;
        mBoxMenu = new HashMap<Class, Box>();
    }

    public <E> Box<E> boxFor(Class<E> clazz) {
        if (mBoxMenu.containsKey(clazz)) {
            return mBoxMenu.get(clazz);
        } else {
            //TODO 找到对应的EnityCursor类
            try {
                Class enityClass = Class.forName(EnityProcessor.EnityCursorPath + "." + clazz.getSimpleName() + "_");
                EnityCursor enityCursor = (EnityCursor) enityClass.newInstance();
                Box<E> box = new Box<E>(enityCursor, this);
                mBoxMenu.put(clazz, box);
                return box;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public Engine getEngine() {
        return mEngine;
    }

    public ConnectionPool getPool() {
        return mPool;
    }

    public abstract ConnectionPool withConfig(PoolConfig config);
}
