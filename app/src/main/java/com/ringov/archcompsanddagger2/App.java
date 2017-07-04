package com.ringov.archcompsanddagger2;

import android.app.Application;

import com.ringov.archcompsanddagger2.di.AppComponent;
import com.ringov.archcompsanddagger2.di.AppModule;
import com.ringov.archcompsanddagger2.di.DaggerAppComponent;
import com.ringov.archcompsanddagger2.di.GetUserServiceModule;
import com.ringov.archcompsanddagger2.di.UserRepositoryModule;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class App extends Application {

    private static AppComponent component;

    public static AppComponent getComponent(){
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .getUserServiceModule(new GetUserServiceModule())
                .userRepositoryModule(new UserRepositoryModule())
                .build();
    }
}
