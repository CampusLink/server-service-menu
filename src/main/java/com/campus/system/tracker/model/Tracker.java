package com.campus.system.tracker.model;

import com.campus.system.storage.model.BoxObj;

public class Tracker extends BoxObj {
    private String mTrackerId;
    private String mUserId;
    private String mLayout;
    private String mItem;
    private String mOperate;
    private String mExtra;
    private long mCreateTime;

    public Tracker(long ID) {
        super(ID);
    }

    public String getTrackerId() {
        return mTrackerId;
    }

    public void setTrackerId(String trackerId) {
        mTrackerId = trackerId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getLayout() {
        return mLayout;
    }

    public void setLayout(String layout) {
        mLayout = layout;
    }

    public String getItem() {
        return mItem;
    }

    public void setItem(String item) {
        mItem = item;
    }

    public String getOperate() {
        return mOperate;
    }

    public void setOperate(String operate) {
        mOperate = operate;
    }

    public String getExtra() {
        return mExtra;
    }

    public void setExtra(String extra) {
        mExtra = extra;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }
}
