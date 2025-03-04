package com.example.hhhhhh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


        textViewResult = findViewById(R.id.textViewResult);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String address = intent.getStringExtra("address");
        String city = intent.getStringExtra("city");

        // Display data
        String displayText = "Nom : " + name + "\n" +
                "Email : " + email + "\n" +
                "Phone : " + phone + "\n" +
                "Adresse : " + address + "\n" +
                "Ville : " + city;

        textViewResult.setText(displayText);
    }
}
