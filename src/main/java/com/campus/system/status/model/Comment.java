package com.campus.system.status.model;

public class Comment {
    private long mId;
    private String mStatusId;//评论所属的动态
    private String mContent;//评论的内容
    private String mUserId;//谁发表的评论
    private String mReciveId;//发给哪个用户的评论
    private long mCreateTime;
    private int mStatus;//当前评论的状态

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getStatusId() {
        return mStatusId;
    }

    public void setStatusId(String statusId) {
        mStatusId = statusId;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public String getReciveId() {
        return mReciveId;
    }

    public void setReciveId(String reciveId) {
        mReciveId = reciveId;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public static interface CommentStatus{
        public static final int NONE = 0;
        public static final int READ = 1;
        public static final int DELETED = 2;
    }
}
