package com.ringov.archcompsanddagger2.ui;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ringov.archcompsanddagger2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class UserProfileFragment extends LifecycleFragment {

    UserProfileViewModel viewModel;

    @BindView(R.id.tv)
    TextView name;
    @OnClick(R.id.btn)
    void onClick(){
        viewModel.nextUser();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel.class);
        viewModel.getUser()
                .observe(this, user -> name.setText(user.getName()));
    }
}