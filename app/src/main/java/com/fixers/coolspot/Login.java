package com.fixers.coolspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view){
        Intent intent = new Intent(Login.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
