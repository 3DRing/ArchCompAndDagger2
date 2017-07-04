package com.ringov.archcompsanddagger2.di;

import android.support.annotation.NonNull;

import com.ringov.archcompsanddagger2.model.GetUserService;
import com.ringov.archcompsanddagger2.model.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

@Module
public class UserRepositoryModule {

    @Provides
    @NonNull
    @Singleton
    public UserRepository provideUserRepository(GetUserService userService) {
        return new UserRepository(userService);
    }

}
