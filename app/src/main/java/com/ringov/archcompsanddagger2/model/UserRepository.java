package com.ringov.archcompsanddagger2.model;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */
@Singleton
public class UserRepository {

    private final GetUserService userService;
    private UserLiveData data;

    private int counter;

    @Inject
    public UserRepository(GetUserService userService) {
        this.userService = userService;
        data = new UserLiveData();
        nextUser();
    }

    public LiveData<User> getUser() {
        return data;
    }

    public void nextUser() {
        User user = userService.getUser(counter);
        data.changeUser(user);
        counter++;
    }
}