package com.campus.system.status;

import com.campus.system.service.Service;
import com.campus.system.status.model.*;
import com.campus.system.user.model.User;

import java.util.List;

public abstract class StatusService extends Service {

    public abstract Status sendStatus(String token, Status status);

    public abstract String[] uploadStatusPhotos(String token, String... photos);

    public abstract Comment sendStatusComment(String token, String statusId, String comment);

    public abstract boolean followUser(String token, String followId);

    public abstract boolean unFollowUser(String token, String followId);

    public abstract List<Status> queryTimeLine(String token, String preId, int pageSize);

    public abstract List<Status> queryStatusList(String token, String userId, String preId, int pageSize);

    public abstract boolean resetCover(String token, String cover);

    public abstract Visitor trackVistorHistory(String token, String visitorId);

    public abstract List<Visitor> queryVistoryHistory(String token, String mPreId, int pageSize);

    public abstract Tag createTag(String token, Tag tag);

    public abstract List<Tag> queryTags(String token);

    public abstract boolean resetTagName(String token, String tagName);

    public abstract boolean deleteTag(String token, String tagId);

    public abstract List<User> queryTagUsers(String token, String tagId);

    public abstract boolean insertUserToTag(String token, String userId, String tagId);

    public abstract boolean removeUserFromTag(String token, String userId, String tagId);

    public abstract List<Comment> queryStatusComments(String token, String statusId, String preId, int pageSize);

    public abstract boolean deleteComment(String token, String commentId);

    public abstract boolean heartStatus(String token, String userId);

    public abstract boolean removeHeart(String token, String heartId);

    public abstract List<Heart> queryHearts(String token, String statusId, String preId, int pageSize);

}
