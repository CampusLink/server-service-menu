package com.campus.system.status.model;

public class Visitor {
    private long mId;
    private String mUserId;
    private String mVisitorId;
    private long mCreateTime;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getVisitorId() {
        return mVisitorId;
    }

    public void setVisitorId(String visitorId) {
        mVisitorId = visitorId;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }
}
