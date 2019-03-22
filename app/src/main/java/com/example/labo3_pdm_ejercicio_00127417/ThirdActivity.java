package com.example.labo3_pdm_ejercicio_00127417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView name, last, email, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        name = findViewById(R.id.tv_name_third);
        last = findViewById(R.id.tv_lastname_third);
        email = findViewById(R.id.tv_email_third);
        gender = findViewById(R.id.tv_gender_third);

        Intent mIntent = getIntent();

        if(mIntent != null){
            name.setText(mIntent.getStringExtra("name"));
            last.setText(mIntent.getStringExtra("last"));
            email.setText(mIntent.getStringExtra("email"));
            gender.setText(mIntent.getStringExtra("gender"));
        }

    }
}
