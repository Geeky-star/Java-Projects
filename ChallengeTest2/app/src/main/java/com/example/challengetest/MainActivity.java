package com.example.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void register(View view){

    EditText firstname = findViewById(R.id.editFirstName);
    EditText lastname = findViewById(R.id.editLastName);
    EditText emails = findViewById(R.id.editEmail);

    TextView firstNameView = findViewById(R.id.firstName);
    TextView lastNameView = findViewById(R.id.lastName);
    TextView emailView = findViewById(R.id.emailText);

    firstNameView.setText("Hello " + firstname.getText().toString());
    lastNameView.setText(lastname.getText().toString());
    emailView.setText(emails.getText().toString());
}
}