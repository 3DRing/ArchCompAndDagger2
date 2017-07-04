package com.ringov.archcompsanddagger2.model;

import android.arch.lifecycle.LiveData;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class UserLiveData extends LiveData<User> {

    public void changeUser(User user){
        setValue(user);
    }
}
