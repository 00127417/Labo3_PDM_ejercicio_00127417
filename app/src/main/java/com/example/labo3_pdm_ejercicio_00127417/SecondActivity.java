package com.example.labo3_pdm_ejercicio_00127417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView vName, vLast, vEmail, vGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        vName = findViewById(R.id.tv_name_second);
        vLast = findViewById(R.id.tv_lastname_second);
        vEmail = findViewById(R.id.tv_email_second);
        vGender = findViewById(R.id.tv_gender_second);

        Intent mIntent = getIntent();

        if (mIntent != null) {
            vName.setText(mIntent.getStringExtra("name_text"));
            vLast.setText(mIntent.getStringExtra("last_text"));
            vEmail.setText(mIntent.getStringExtra("email_text"));
            vGender.setText(mIntent.getStringExtra("gender_text"));
        }
    }
}
