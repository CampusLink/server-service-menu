package com.campus.system.menu;

import com.campus.system.storage.ResultSet.ResultSet;
import com.campus.system.storage.box.EnityCursor;
import com.campus.system.storage_annotation.property.DateProperty;
import com.campus.system.storage_annotation.property.Id;
import com.campus.system.storage_annotation.property.IntProperty;
import com.campus.system.storage_annotation.property.Property;
import com.campus.system.storage_annotation.property.StringProperty;
import com.campus.system.user.model.OrgReq;
import java.lang.Exception;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class OrgReq_ extends EnityCursor<OrgReq> {
  public static Id mId =  new Id("", "",0, true);

  public static StringProperty mOrgReqId =  new StringProperty("orgReqId", "请求的ID","", 225);

  public static StringProperty mUserId =  new StringProperty("userId", "","", 225);

  public static StringProperty mOrgId =  new StringProperty("orgId", "组织的ID","", 225);

  public static StringProperty mComment =  new StringProperty("comment", "请求加入组织的备注","", 225);

  public static DateProperty mCreateTime =  new DateProperty("createTime", "请求创建时间", new Date(1992, 12, 3));

  public static IntProperty mStatus =  new IntProperty("status", "当前请求的状态",0, false);

  public static StringProperty mAdminId =  new StringProperty("adminId", "哪个管理员操作的","", 225);

  public OrgReq_() {
    super("orgReq");
    mEnityClass = OrgReq.class;
    mProperties.add(mId);
    mProperties.add(mOrgReqId);
    mProperties.add(mUserId);
    mProperties.add(mOrgId);
    mProperties.add(mComment);
    mProperties.add(mCreateTime);
    mProperties.add(mStatus);
    mProperties.add(mAdminId);
  }

  public static void setId(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setId(resultSet.getId(resultSet.findColumn(mId.getNameInDb())));
  }

  public static void setOrgReqId(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setOrgReqId(resultSet.getString(resultSet.findColumn(mOrgReqId.getNameInDb())));
  }

  public static void setUserId(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setUserId(resultSet.getString(resultSet.findColumn(mUserId.getNameInDb())));
  }

  public static void setOrgId(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setOrgId(resultSet.getString(resultSet.findColumn(mOrgId.getNameInDb())));
  }

  public static void setComment(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setComment(resultSet.getString(resultSet.findColumn(mComment.getNameInDb())));
  }

  public static void setCreateTime(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setCreateTime(resultSet.getDate(resultSet.findColumn(mCreateTime.getNameInDb())));
  }

  public static void setStatus(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setStatus(resultSet.getInt(resultSet.findColumn(mStatus.getNameInDb())));
  }

  public static void setAdminId(OrgReq enity, ResultSet resultSet) throws Exception {
    enity.setAdminId(resultSet.getString(resultSet.findColumn(mAdminId.getNameInDb())));
  }

  public List<OrgReq> parseResult(ResultSet resultSet, List<Property> keys) throws Exception {
    List<OrgReq> list = new ArrayList();
    while(resultSet.next()){
    OrgReq t = new OrgReq();
    if(keys.contains(mId)){
         setId(t, resultSet);
    }
    if(keys.contains(mOrgReqId)){
         setOrgReqId(t, resultSet);
    }
    if(keys.contains(mUserId)){
         setUserId(t, resultSet);
    }
    if(keys.contains(mOrgId)){
         setOrgId(t, resultSet);
    }
    if(keys.contains(mComment)){
         setComment(t, resultSet);
    }
    if(keys.contains(mCreateTime)){
         setCreateTime(t, resultSet);
    }
    if(keys.contains(mStatus)){
         setStatus(t, resultSet);
    }
    if(keys.contains(mAdminId)){
         setAdminId(t, resultSet);
    }
    list.add(t);
    }
    return list;
  }

  public HashMap<Property, Object> saveBean(OrgReq enity) {
    HashMap<Property, Object> properties = new HashMap();
    if(enity.getId()>0){
         properties.put(mId, enity.getId());
    }
    if(enity.getOrgReqId() != null && enity.getOrgReqId().length() > 0){
         properties.put(mOrgReqId, enity.getOrgReqId());
    }
    if(enity.getUserId() != null && enity.getUserId().length() > 0){
         properties.put(mUserId, enity.getUserId());
    }
    if(enity.getOrgId() != null && enity.getOrgId().length() > 0){
         properties.put(mOrgId, enity.getOrgId());
    }
    if(enity.getComment() != null && enity.getComment().length() > 0){
         properties.put(mComment, enity.getComment());
    }
    if(!com.campus.system.storage_annotation.util.DateUtil.dateIsNull(enity.getCreateTime())){
         properties.put(mCreateTime, enity.getCreateTime());
    }
    if(enity.getStatus()>0){
         properties.put(mStatus, enity.getStatus());
    }
    if(enity.getAdminId() != null && enity.getAdminId().length() > 0){
         properties.put(mAdminId, enity.getAdminId());
    }
    return properties;}
}
