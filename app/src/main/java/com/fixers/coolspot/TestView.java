package com.fixers.coolspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestView extends AppCompatActivity {

    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpannel);


        button1 = (Button) findViewById(R.id.addItems);
        //button2 = (Button) findViewById(R.id.ViewItems);

        button1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                openAddItems();
            }


        });


        button2 = (Button) findViewById(R.id.ViewProfile);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openUser();

            }


        });

    }

    public void openAddItems() {

        Intent AddItems = new Intent(this, AddItems2.class);
        startActivity(AddItems);


    }

    public void openUser() {

        Intent ViewItems = new Intent(this, ViewProfile2.class);
        startActivity(ViewItems);
    }
}
