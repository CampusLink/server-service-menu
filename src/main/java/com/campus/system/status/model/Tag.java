package com.campus.system.status.model;

public class Tag {
    private String mTagId;
    private String mName;
    private String mUserId;
    private long mCreateTime;

    public String getTagId() {
        return mTagId;
    }

    public void setTagId(String tagId) {
        mTagId = tagId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
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
