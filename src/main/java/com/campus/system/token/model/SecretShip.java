package com.campus.system.token.model;

public class SecretShip {
    private String mUserId;
    private String mSecret;
    private String mToken;
    private long mCreateTime;

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getSecret() {
        return mSecret;
    }

    public void setSecret(String secret) {
        mSecret = secret;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        mToken = token;
    }
}
