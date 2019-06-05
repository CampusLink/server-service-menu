package com.campus.system.storage.connection;

public class PoolConfig {
    private String mStoreName;
    private String mUserName;
    private String mPassword;
    private String mUrl;
    private String mUnicode;
    private int mInitPoolSize;
    private int mMaxPoolSize;
    private int mMinPoolSize;
    private int mCheckTime;

    private PoolConfig(String url, String storeName,
                       String username, String password, String unicode,
                      int initPoolSize,
                      int maxPoolSize, int minPoolSize, int checkTime) {
        mStoreName = storeName;
        mUserName = username;
        mPassword = password;
        mUrl = url;
        mUnicode = unicode;
        mInitPoolSize = initPoolSize;
        mMaxPoolSize = maxPoolSize;
        mMinPoolSize = minPoolSize;
        mCheckTime = checkTime;
    }

    public static PoolConfig defaultConfig(String url, String storeName,
                                           String username, String password){
        return new PoolConfig(url, storeName, username, password, "UTF-8"
                , 3,10, 3, 1000 * 60 * 10);
    }

    public static PoolConfig customConfig(String url, String storeName,
                                          String username, String password, String unicode,
                                          int initPoolSize,
                                          int maxPoolSize, int minPoolSize, int checkTime){
        return new PoolConfig(url, storeName, username, password, unicode,
                initPoolSize, maxPoolSize, minPoolSize, checkTime);
    }

    public String getStoreName() {
        return mStoreName;
    }

    public String getUserName() {
        return mUserName;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getUnicode() {
        return mUnicode;
    }

    public int getInitPoolSize() {
        return mInitPoolSize;
    }

    public int getMaxPoolSize() {
        return mMaxPoolSize;
    }

    public int getMinPoolSize() {
        return mMinPoolSize;
    }

    public int getCheckTime() {
        return mCheckTime;
    }
}
