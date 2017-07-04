package com.ringov.archcompsanddagger2.di;

import com.ringov.archcompsanddagger2.ui.UserProfileViewModel;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

@Component(modules = {AppModule.class, GetUserServiceModule.class, UserRepositoryModule.class})
@Singleton
public interface AppComponent {

    void inject(UserProfileViewModel viewModel);

}
