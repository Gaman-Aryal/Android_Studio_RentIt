package com.example.rentit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    Databasehelper myDb;
    private EditText name, email, phone, gender, location, password;
    private Button SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        myDb = new Databasehelper(this);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        location = findViewById(R.id.location);
        gender = findViewById(R.id.gender);
        password = findViewById(R.id.password);
        SignUp = findViewById(R.id.signupbtn);


    }

    public void validation(View view) {
        String fullName = name.toString();
        String Email = email.toString();
        String Phone = phone.toString();
        String Location = location.toString();
        String Gender = gender.toString();
        String Password = password.toString();

        if (fullName.isEmpty() && Email.isEmpty() && Phone.isEmpty() && Location.isEmpty() && Gender.isEmpty() && Password.isEmpty()) {
            Toast.makeText(this, "All Fields Are Empty", Toast.LENGTH_SHORT).show();
        } else if (fullName.isEmpty()) {
            Toast.makeText(this, "FullName Is Empty", Toast.LENGTH_SHORT).show();
        } else if (Email.isEmpty()) {
            Toast.makeText(this, "Email Is Empty", Toast.LENGTH_SHORT).show();
        } else if (Phone.isEmpty()) {
            Toast.makeText(this, "Phone Is Empty", Toast.LENGTH_SHORT).show();
        } else if (Location.isEmpty()) {
            Toast.makeText(this, "Location Is Empty", Toast.LENGTH_SHORT).show();
        } else if (Gender.isEmpty()) {
            Toast.makeText(this, "Gender Is Empty", Toast.LENGTH_SHORT).show();
        } else if (Password.isEmpty()) {
            Toast.makeText(this, "Password Is Empty", Toast.LENGTH_SHORT).show();
        } else
            AddData();
    }


    public void AddData() {
        SignUp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = myDb.insertData(name.getText().toString(),
                                email.getText().toString(),
                                phone.getText().toString(),
                                gender.getText().toString(),
                                password.getText().toString(),
                                location.getText().toString());

                        if (isInserted == true) {
                            Toast.makeText(RegistrationActivity.this, "Signup Successful", Toast.LENGTH_SHORT).show();
                            Intent FromLoginToSignin = new Intent(RegistrationActivity.this, LoginActivity.class);

                        } else if (isInserted == false)
                            Toast.makeText(RegistrationActivity.this, "Insert data Correctly", Toast.LENGTH_SHORT).show();
                        else {
                            Intent FromLoginToSignin = new Intent(RegistrationActivity.this, LoginActivity.class);
                        }

                    }
                });
    }


}





