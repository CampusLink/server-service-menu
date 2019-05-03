package com.campus.system.cupid.model;
//组织联谊记录
public class OrgRecommend {
    private long mId;
    private String mRecommendId;
    private String mOrgId;
    private String mRecommendOrgId;//被推荐的组织ID
    private long mExpire;//被推荐时间
    private long mCreateTime;
    private String mUserId;//谁设置的此推荐

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getRecommendId() {
        return mRecommendId;
    }

    public void setRecommendId(String recommendId) {
        mRecommendId = recommendId;
    }

    public String getOrgId() {
        return mOrgId;
    }

    public void setOrgId(String orgId) {
        mOrgId = orgId;
    }

    public String getRecommendOrgId() {
        return mRecommendOrgId;
    }

    public void setRecommendOrgId(String recommendOrgId) {
        mRecommendOrgId = recommendOrgId;
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

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }
}
