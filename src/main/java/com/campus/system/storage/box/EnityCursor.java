package com.campus.system.storage.box;

import com.campus.system.storage.ResultSet.ResultSet;
import com.campus.system.storage_annotation.property.Property;

import java.util.ArrayList;
import java.util.List;

public abstract class EnityCursor<T> {
    public List mProperties;
    public String mTableName;
    public Class<? extends T> mEnityClass;

    public EnityCursor(String tableName) {
        mProperties = new ArrayList();
        mTableName = tableName;
    }

    public abstract List<T> parseResult(ResultSet resultSet, List<Property> keys) throws Exception;

    public List getProperties() {
        return mProperties;
    }

    public String getTableName() {
        return mTableName;
    }
}
