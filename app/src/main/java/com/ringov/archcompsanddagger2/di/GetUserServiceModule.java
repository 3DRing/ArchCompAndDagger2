package com.ringov.archcompsanddagger2.di;

import android.support.annotation.NonNull;

import com.ringov.archcompsanddagger2.model.GetUserService;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

@Module
public class GetUserServiceModule {

    @Provides
    @NonNull
    @Singleton
    public GetUserService provideGetUserService(){
        return new GetUserService();
    }
}
