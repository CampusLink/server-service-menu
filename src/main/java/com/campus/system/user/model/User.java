package com.campus.system.user.model;


import com.campus.system.storage_annotation.annotation.*;

import java.util.Date;

@Enity(name = "user")
public class User {
    @Id
    private long mId;
    @StringProperty(nameInDb = "userId", length = 50)
    private String mUserId;
    @StringProperty(nameInDb = "phone", length = 18)
    private String mPhone;
    @StringProperty(nameInDb = "password", length = 20)
    private String mPassword;
    @StringProperty(nameInDb = "name", length = 10)
    private String mName;
    @DateProperty(nameInDb = "birth", defalutValue = {1985, 01, 01})
    private Date mBirth;
    @IntProperty(nameInDb = "sex")
    private int mSex;
    @StringProperty(nameInDb = "sign")
    private String mSign;
    @StringProperty(nameInDb = "head")
    private String mHead;
    @StringProperty(nameInDb = "nickName")
    private String mNickName;
    @StringProperty(nameInDb = "orgId")
    private String mOrgId;
    @StringProperty(nameInDb = "orgDesc")
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

    public Date getBirth() {
        return mBirth;
    }

    public void setBirth(Date birth) {
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
