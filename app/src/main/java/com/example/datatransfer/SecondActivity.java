package com.example.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tname,temail,tphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tname = findViewById(R.id.textViewName);
        temail = findViewById(R.id.textViewEmail);
        tphone = findViewById(R.id.textViewPhone);

        //Retreiving the data from the MainActivity

        Intent i = getIntent();
        String userName = i.getStringExtra("his_name");
        String userEmail = i.getStringExtra("his_email");
        String userPhone = i.getStringExtra("his_phone");

        //Linking the retreived values with our TextViews

        tname.setText("Hello "+userName);
        temail.setText("Your email id is "+userEmail);
        tphone.setText("Your phone number is "+String.valueOf(userPhone));
    }
}