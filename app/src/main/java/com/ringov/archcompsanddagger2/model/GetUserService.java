package com.ringov.archcompsanddagger2.model;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class GetUserService {

    private int counter;

    public User getUser(int userId) {
        return new User(userId, "User " + userId);
    }
}
