package com.safaiqtifan.socialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.safaiqtifan.socialmediaapp.ui.main.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }
    }
}