package com.campus.system.storage.engine;

import com.campus.system.storage.box.Box;
import com.campus.system.storage.box.BoxQuery;
import com.campus.system.storage.connection.ConnectionPool;
import com.campus.system.storage_annotation.property.Id;

import java.util.List;

public abstract class Engine {
    public abstract <T> T save(T t, Box<T> box, ConnectionPool pool);

    public abstract <T> T remove(T t, Box<T> box, ConnectionPool pool);

    public abstract <T> T update(T t, Box<T> box, ConnectionPool pool);

    public abstract <T> T get(Id id, Box<T> box, ConnectionPool pool);

    public abstract <T> List<T> find(BoxQuery<T> query, Box<T> box, ConnectionPool pool);
}
