package com.fixers.coolspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void guestView(View view){
        Intent intent = new Intent(WelcomeActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
    public void viewLogin(View view){
        Intent intent = new Intent(WelcomeActivity.this,Login.class);
        startActivity(intent);
        finish();
    }

    public void viewSignUp(View view){
        Intent intent = new Intent(WelcomeActivity.this,SignUp.class);
        startActivity(intent);
        finish();
    }
}
