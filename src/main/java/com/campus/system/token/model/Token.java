package com.campus.system.token.model;

public class Token{
    private String mTokenId;
    private String mUserId;
    private long mExpire;
    private long mCreateTime;

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
}
