package com.campus.system.menu;

import com.campus.system.storage.ResultSet.ResultSet;
import com.campus.system.storage.box.EnityCursor;
import com.campus.system.storage_annotation.model.Date;
import com.campus.system.storage_annotation.property.DateProperty;
import com.campus.system.storage_annotation.property.Id;
import com.campus.system.storage_annotation.property.IntProperty;
import com.campus.system.storage_annotation.property.Property;
import com.campus.system.storage_annotation.property.StringProperty;
import com.campus.system.user.model.User;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;

public class User_ extends EnityCursor<User> {
  public static Id mId =  new Id("", "",0, true);

  public static StringProperty mUserId =  new StringProperty("userId", "","", 50);

  public static StringProperty mPhone =  new StringProperty("phone", "","", 18);

  public static StringProperty mPassword =  new StringProperty("password", "","", 20);

  public static StringProperty mName =  new StringProperty("name", "","", 10);

  public static DateProperty mBirth =  new DateProperty("birth", "", new Date(1985, 1, 1));

  public static IntProperty mSex =  new IntProperty("sex", "",0, false);

  public static StringProperty mSign =  new StringProperty("sign", "","", 225);

  public static StringProperty mHead =  new StringProperty("head", "","", 225);

  public User_() {
    super("user");
    mEnityClass = User.class;
    mProperties.add(mId);
    mProperties.add(mUserId);
    mProperties.add(mPhone);
    mProperties.add(mPassword);
    mProperties.add(mName);
    mProperties.add(mBirth);
    mProperties.add(mSex);
    mProperties.add(mSign);
    mProperties.add(mHead);
  }

  public static void setId(User enity, ResultSet resultSet) throws Exception {
    enity.setId(resultSet.getId(resultSet.findColumn(mId.getNameInDb())));
  }

  public static void setUserId(User enity, ResultSet resultSet) throws Exception {
    enity.setUserId(resultSet.getString(resultSet.findColumn(mUserId.getNameInDb())));
  }

  public static void setPhone(User enity, ResultSet resultSet) throws Exception {
    enity.setPhone(resultSet.getString(resultSet.findColumn(mPhone.getNameInDb())));
  }

  public static void setPassword(User enity, ResultSet resultSet) throws Exception {
    enity.setPassword(resultSet.getString(resultSet.findColumn(mPassword.getNameInDb())));
  }

  public static void setName(User enity, ResultSet resultSet) throws Exception {
    enity.setName(resultSet.getString(resultSet.findColumn(mName.getNameInDb())));
  }

  public static void setBirth(User enity, ResultSet resultSet) throws Exception {
    enity.setBirth(resultSet.getDate(resultSet.findColumn(mBirth.getNameInDb())));
  }

  public static void setSex(User enity, ResultSet resultSet) throws Exception {
    enity.setSex(resultSet.getInt(resultSet.findColumn(mSex.getNameInDb())));
  }

  public static void setSign(User enity, ResultSet resultSet) throws Exception {
    enity.setSign(resultSet.getString(resultSet.findColumn(mSign.getNameInDb())));
  }

  public static void setHead(User enity, ResultSet resultSet) throws Exception {
    enity.setHead(resultSet.getString(resultSet.findColumn(mHead.getNameInDb())));
  }

  public List<User> parseResult(ResultSet resultSet, List<Property> keys) throws Exception {
    List<User> list = new ArrayList();
    while(resultSet.next()){
    User t = new User();
    if(keys.contains(mId)){
    setId(t, resultSet);
    }
    if(keys.contains(mUserId)){
    setUserId(t, resultSet);
    }
    if(keys.contains(mPhone)){
    setPhone(t, resultSet);
    }
    if(keys.contains(mPassword)){
    setPassword(t, resultSet);
    }
    if(keys.contains(mName)){
    setName(t, resultSet);
    }
    if(keys.contains(mBirth)){
    setBirth(t, resultSet);
    }
    if(keys.contains(mSex)){
    setSex(t, resultSet);
    }
    if(keys.contains(mSign)){
    setSign(t, resultSet);
    }
    if(keys.contains(mHead)){
    setHead(t, resultSet);
    }
    list.add(t);
    }
    return list;
  }
}
