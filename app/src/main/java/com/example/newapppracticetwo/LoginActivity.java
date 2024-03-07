package com.example.newapppracticetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name;
    EditText emaiid;
    EditText password;
    Button btnproceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        name = findViewById(R.id.name);
        emaiid = findViewById(R.id.emailid);
        password = findViewById(R.id.password);
        btnproceed = findViewById(R.id.btnproceed);

        btnproceed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String namestr = name.getText().toString();
                String emailidstr = emaiid.getText().toString();
                String passwordstr = password.getText().toString();

                if (namestr.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please Enter Name", Toast.LENGTH_SHORT).show();

                } else if (emailidstr.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please Enter Email ID", Toast.LENGTH_SHORT).show();

                } else if (passwordstr.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }

                if (namestr.isEmpty() || emailidstr.isEmpty() || passwordstr.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "U Can't Proceed", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }
}