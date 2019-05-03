package com.campus.system.user;

import com.campus.system.service.Service;
import com.campus.system.user.model.OrgReq;
import com.campus.system.user.model.User;

import java.util.List;

public abstract class UserService extends Service {

    public abstract User loginByPhoneAndAuthCode(String phone, String code);

    public abstract User registerByPhoneAndAuthCode(String phone, String code);

    public abstract void initLoginPassword(String token, String password);

    public abstract void resetLoginPassword(String token, String password);

    public abstract void sendLoginAuthCode(String phone, String deviceId);

    public abstract User queryUserDescById(String token, String userId);

    public abstract User queryUserInfoById(String token, String userId);

    public abstract void resetUserHead(String token, String head);

    public abstract void resetUserNickName(String token, String nickName);

    public abstract void resetUserSign(String token, String sign);

    public abstract void resetUserLoginPhone(String resetPhoneToken, String phone, String authCode);

    public abstract String requestResetLoginPhoneToken(String token, String... passwords);

    public abstract void requestResetUserOrgInfo(String token, String orgId, String orgDesc);

    public abstract List<OrgReq> queryOrgReqListByAdmin(String token, String preId, int pageSize);

    public abstract void operateOrgReqByAdmin(String token, String orgReqId, boolean agree);

    public abstract User asyncUserInfo(String token);
}
