package com.campus.system.cupid.model;

import com.campus.system.status.model.Status;
import com.campus.system.user.model.User;

import java.util.List;

public class CupidUser {
    private List<String> mAlbums;
    private User mUser;
    private List<Status> mStatuses;
    private List<Question> mQuestions;

    public List<String> getAlbums() {
        return mAlbums;
    }

    public void setAlbums(List<String> albums) {
        mAlbums = albums;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public List<Status> getStatuses() {
        return mStatuses;
    }

    public void setStatuses(List<Status> statuses) {
        mStatuses = statuses;
    }

    public List<Question> getQuestions() {
        return mQuestions;
    }

    public void setQuestions(List<Question> questions) {
        mQuestions = questions;
    }
}
