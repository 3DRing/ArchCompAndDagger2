package com.ringov.archcompsanddagger2.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.ringov.archcompsanddagger2.App;
import com.ringov.archcompsanddagger2.model.User;
import com.ringov.archcompsanddagger2.model.UserRepository;

import javax.inject.Inject;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class UserProfileViewModel extends ViewModel {

    @Inject
    UserRepository userRepo;

    @Inject
    public UserProfileViewModel() {
        App.getComponent().inject(this);
    }

    public LiveData<User> getUser() {
        return userRepo.getUser();
    }

    public void nextUser() {
        userRepo.nextUser();
    }
}
