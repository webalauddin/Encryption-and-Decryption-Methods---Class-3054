package com.example.cryptographicdataprotection_class3049;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button encryptButton, decryptButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        encryptButton = findViewById(R.id.encryptButton);
        decryptButton = findViewById(R.id.decryptButton);
        result = findViewById(R.id.result);


/*
        encryptButton.setOnClickListener(v -> {

            try {

              String plainText = myMethods.encryptionData("I Love You Sadia ", "N9@tF2x#Lp7zQ1vW");
              result.setText(plainText);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        });


        decryptButton.setOnClickListener(v -> {

            try {

                String decodedData = myMethods.decryptedData("m1B3UMB4xSLUCZmUspT+2T+QXamzrk6hqkjmUUzJH7M=", "N9@tF2x#Lp7zQ1vW");
                result.setText(decodedData);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        });*/




    }
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------














}