package com.campus.system.user.model;

public class OrgReq {
    private String mOrgReqId;
    private String mUserId;
    private String mOrgId;
    private String mOrgDesc;
    private long mCreateTime;
    private int mStatus;
    private String mAdminId;//那个管理员操作的

    public String getOrgReqId() {
        return mOrgReqId;
    }

    public void setOrgReqId(String orgReqId) {
        mOrgReqId = orgReqId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getOrgId() {
        return mOrgId;
    }

    public void setOrgId(String orgId) {
        mOrgId = orgId;
    }

    public String getOrgDesc() {
        return mOrgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        mOrgDesc = orgDesc;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public String getAdminId() {
        return mAdminId;
    }

    public void setAdminId(String adminId) {
        mAdminId = adminId;
    }

    public static interface OrgReqStatus{
        public static final int NONE = 0;
        public static final int AGREE = 1;
        public static final int DISAGREE = 2;
    }
}
