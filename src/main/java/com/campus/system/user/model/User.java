package com.campus.system.user.model;

public class User {
    private long mId;//数据库ID
    private String mUserId;
    private String mPhone;
    private String mPassword;
    private String mName;
    private long mBirth;
    private int mSex;
    private String mSign;
    private String mHead;
    private String mNickName;
    private String mOrgId;
    private String mOrgDesc;

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

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public long getBirth() {
        return mBirth;
    }

    public void setBirth(long birth) {
        mBirth = birth;
    }

    public int getSex() {
        return mSex;
    }

    public void setSex(int sex) {
        mSex = sex;
    }

    public String getSign() {
        return mSign;
    }

    public void setSign(String sign) {
        mSign = sign;
    }

    public String getHead() {
        return mHead;
    }

    public void setHead(String head) {
        mHead = head;
    }

    public String getNickName() {
        return mNickName;
    }

    public void setNickName(String nickName) {
        mNickName = nickName;
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
}
