package com.example.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        email = findViewById(R.id.editTextEmail);
        phone = findViewById(R.id.editTextPhone);

        signup = findViewById(R.id.btnSignUp);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPhone = phone.getText().toString();

                //Creating the intent for sending the data

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("his_name",userName);
                i.putExtra("his_email",userEmail);
                i.putExtra("his_phone",userPhone);
                startActivity(i);


            }
        });








    }
}