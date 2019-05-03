package com.campus.system.cupid;

import com.campus.system.cupid.model.CupidUser;
import com.campus.system.cupid.model.Question;
import com.campus.system.organization.model.Organization;
import com.campus.system.service.Service;

import java.util.List;

public abstract class CupidService extends Service {
    public abstract void resetAlbum(String token, String[] photos);

    public abstract void uploadAlbum(String token, String... photos);

    public abstract void insertQuestion(String token, Question question);

    public abstract void answerQuestion(String token, String questionId, String answer);

    public abstract CupidUser getUserCard(String token, String userId);

    public abstract List<Organization> queryRecommendOrgs(String token);

    public abstract List<CupidUser> queryRecommendCards(String token);

    public abstract void heartCard(String token, String userId);

    public abstract void missCard(String token, String userId);
}
