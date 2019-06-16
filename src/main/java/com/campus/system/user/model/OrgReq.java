package com.campus.system.user.model;

import com.campus.system.storage_annotation.annotation.*;

import java.util.Date;

@Enity(name = "orgReq")
public class OrgReq {
    @Id
    private long mId;
    @StringProperty(nameInDb = "orgReqId", desc = "请求的ID")
    private String mOrgReqId;
    @StringProperty(nameInDb = "userId")
    private String mUserId;
    @StringProperty(nameInDb = "orgId", desc = "组织的ID")
    private String mOrgId;
    @StringProperty(nameInDb = "comment", desc = "请求加入组织的备注")
    private String mComment;
    @DateProperty(nameInDb = "createTime", desc = "请求创建时间")
    private Date mCreateTime;
    @IntProperty(nameInDb = "status", desc = "当前请求的状态", defaultValue = OrgReqStatus.NONE)
    private int mStatus;
    @StringProperty(nameInDb = "adminId", desc = "哪个管理员操作的")
    private String mAdminId;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

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

    public String getComment() {
        return mComment;
    }

    public void setComment(String comment) {
        mComment = comment;
    }

    public Date getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(Date createTime) {
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
