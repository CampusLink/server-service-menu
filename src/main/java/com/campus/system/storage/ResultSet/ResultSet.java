package com.campus.system.storage.ResultSet;

import com.campus.system.storage_annotation.model.Date;

public abstract class ResultSet {
    public abstract String getString(int columnIndex) throws Exception;

    public abstract boolean getBoolean(int columnIndex) throws Exception;

    public abstract long getId(int columnIndex) throws Exception;

    public abstract Date getDate(int columnIndex) throws Exception;

    public abstract double getDouble(int columnIndex) throws Exception;

    public abstract int getInt(int columnIndex) throws Exception;

    public abstract long getLong(int columnIndex) throws Exception;

    public abstract int findColumn(String nameInDb) throws Exception;

    public abstract boolean next() throws Exception;
}
