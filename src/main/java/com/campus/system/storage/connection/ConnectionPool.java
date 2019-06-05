package com.campus.system.storage.connection;

public abstract class ConnectionPool {
    private PoolConfig mConfig;

    protected ConnectionPool(PoolConfig config){
        mConfig = config;
    }

    public abstract Connection obtain() throws Exception;

    public abstract void release(Connection connection) throws Exception;
}
