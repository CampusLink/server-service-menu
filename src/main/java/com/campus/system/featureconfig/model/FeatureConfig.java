package com.campus.system.featureconfig.model;

public class FeatureConfig {
    private String mFeatureId;
    private String mUserId;//是谁添加的这个AB
    private String mName;
    private String mValue;
    private String mDesc;//这个AB是用来干什么的
    private int mStatus;//当前AB的状态
    private long mCreateTime;//AB的创建时间

    public String getFeatureId() {
        return mFeatureId;
    }

    public void setFeatureId(String featureId) {
        mFeatureId = featureId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public static interface FeatureStatus{
        public static final int NONE = 0;
        public static final int PAUSE = 1;
    }
}
