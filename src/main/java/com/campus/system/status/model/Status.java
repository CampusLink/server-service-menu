package com.campus.system.status.model;

public class Status {
    private String mStatusId;
    private String mCreatorId;
    private String mVisibleTagId;//此动态属于那个标签下可见的
    private String mGoneTagId;//此动态属于那个标签下不可见的
    private long mCreateTime;
    private int mStatusType;
    private String mStatusContent;
    private String mAddress;
    private double mLng;
    private double mLat;
    private int mStatus;//当前动态的状态，是否已删除

    public static interface StatusType{
        public static final int TXT = 0;
        public static final int PHONE = 1;
        public static final int VIDEO = 2;
        public static final int TRANSPOND = 3;//转发别人的动态
        public static final int WEB = 4;//分享的网页
        public static final int MUSIC = 5;//分享的音乐
    }

    public static interface StatuesStatus{
        public static final int NONE = 0;
        public static final int DELETED = 1;
    }

    public String getStatusId() {
        return mStatusId;
    }

    public void setStatusId(String statusId) {
        mStatusId = statusId;
    }

    public String getCreatorId() {
        return mCreatorId;
    }

    public void setCreatorId(String creatorId) {
        mCreatorId = creatorId;
    }

    public String getVisibleTagId() {
        return mVisibleTagId;
    }

    public void setVisibleTagId(String visibleTagId) {
        mVisibleTagId = visibleTagId;
    }

    public String getGoneTagId() {
        return mGoneTagId;
    }

    public void setGoneTagId(String goneTagId) {
        mGoneTagId = goneTagId;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public int getStatusType() {
        return mStatusType;
    }

    public void setStatusType(int statusType) {
        mStatusType = statusType;
    }

    public String getStatusContent() {
        return mStatusContent;
    }

    public void setStatusContent(String statusContent) {
        mStatusContent = statusContent;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public double getLng() {
        return mLng;
    }

    public void setLng(double lng) {
        mLng = lng;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }
}
