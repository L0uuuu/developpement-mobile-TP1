package com.example.applicationmobile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textViewWelcome = findViewById(R.id.textViewWelcome);

        String email = getIntent().getStringExtra("email");
        if (email != null) {
            textViewWelcome.setText("Welcome, " + email + "!");
        }
    }
}
