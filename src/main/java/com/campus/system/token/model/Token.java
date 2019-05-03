package com.campus.system.token.model;

public class Token {
    private long mId;
    private String mTokenId;
    private String mUserId;
    private String mToken;
    private long mExpire;
    private long mCreateTime;
    private String mSecret;//Token的秘钥

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getTokenId() {
        return mTokenId;
    }

    public void setTokenId(String tokenId) {
        mTokenId = tokenId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        mToken = token;
    }

    public long getExpire() {
        return mExpire;
    }

    public void setExpire(long expire) {
        mExpire = expire;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public String getSecret() {
        return mSecret;
    }

    public void setSecret(String secret) {
        mSecret = secret;
    }
}
