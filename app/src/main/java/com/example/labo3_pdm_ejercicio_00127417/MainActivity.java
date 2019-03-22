package com.example.labo3_pdm_ejercicio_00127417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner gender;
    private EditText name, last, email;
    private Button mButton;
    private String tGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_name);
        last = findViewById(R.id.et_lastname);
        email = findViewById(R.id.et_email);
        gender = findViewById(R.id.spinner_gender);
        mButton = findViewById(R.id.action_submmit);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(adapter);
        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tGender = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mButton.setOnClickListener(v -> {
            String tName = name.getText().toString();
            String tLast = last.getText().toString();
            String tEmail = email.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra("name_text", tName);
            mIntent.putExtra("last_text", tLast);
            mIntent.putExtra("email_text", tEmail);
            mIntent.putExtra("gender_text", tGender);
            startActivity(mIntent);
        });
    }

}
