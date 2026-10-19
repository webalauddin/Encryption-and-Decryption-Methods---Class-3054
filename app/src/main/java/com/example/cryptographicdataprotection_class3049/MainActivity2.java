package com.example.cryptographicdataprotection_class3049;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    TextInputEditText enUserName, enPhone, enPassword, deUserName, dePhone, dePassword;
    Button encryptedButton, decryptedButton;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        enUserName = findViewById(R.id.enUserName);
        enPassword = findViewById(R.id.enPassword);
        enPhone = findViewById(R.id.enPhone);
        dePhone = findViewById(R.id.dePhone);
        deUserName = findViewById(R.id.deUserName);
        dePassword = findViewById(R.id.dePassword);
        encryptedButton = findViewById(R.id.encryptedButton);
        decryptedButton = findViewById(R.id.decryptedButton);
        result = findViewById(R.id.result);


        encryptedButton.setOnClickListener(v -> {

            if(enUserName.length()>0 && enPassword.length()>0 && enPhone.length()>0){

                String userName = enUserName.getText().toString();
                String phone = enPhone.getText().toString();
                String password = enPassword.getText().toString();

                try {
                    String[] encodedData = myMethods.encryptionData(userName, phone, password);
                    deUserName.setText(encodedData[0]);
                    dePhone.setText(encodedData[1]);
                    dePassword.setText(password);


                } catch (Exception e) {
                    throw new RuntimeException(e);

                }
;




            } else {
                enUserName.setError("Required");
                enPhone.setError("Required");
                enPassword.setError("Required");
            }

        });


        decryptedButton.setOnClickListener(v -> {

            if(deUserName.length()>0 && dePhone.length()>0 && dePassword.length()>0){

                String userName = deUserName.getText().toString();
                String phone = dePhone.getText().toString();
                String password = dePassword.getText().toString();

                try {

                    String[] decodedData = myMethods.decryptedData(userName, phone, password);
                    result.setText("User Name: "+decodedData[0]+"\nPhone Number: "+decodedData[1]);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }


            } else {
                deUserName.setError("Required");
                deUserName.setError("Required");
                dePassword.setError("Required");
            }


        });









    }
}