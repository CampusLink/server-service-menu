package com.campus.system.status.model;

public class Heart {
    private long mId;
    private String mHeartId;
    private String mStatusId;
    private String mUserId;
    private long mCreateTime;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getHeartId() {
        return mHeartId;
    }

    public void setHeartId(String heartId) {
        mHeartId = heartId;
    }

    public String getStatusId() {
        return mStatusId;
    }

    public void setStatusId(String statusId) {
        mStatusId = statusId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }
}
