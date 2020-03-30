package com.example.rentit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistrationActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Email;
    private EditText PhoneNumber;
    private RadioButton UserType;
    private EditText TemporaryLocation;
    private EditText Password;
    private EditText ConfirmPassword;
    private Button SIGNUP;
    private TextView ErrorMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


//        Name = (EditText)findViewById(R.id.name);
//        Email = (EditText)findViewById(R.id.email);
//        PhoneNumber = (EditText)findViewById(R.id.phonenumber);
//        TemporaryLocation = (EditText)findViewById(R.id.temporarylocation);
//        Password = (EditText)findViewById(R.id.password);
//        ConfirmPassword = (EditText)findViewById(R.id.confirmpassword);
//
//
//
//        SIGNUP = (Button)findViewById(R.id.signup);
//        SIGNUP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                chechPasswordMatch(Password.getText().toString(), ConfirmPassword.getText().toString());
//            }
//        });

    }
//
//    private void checkPasswordMatch(String PASSWORD, String CONFIRMPASSWORD){
//        if(PASSWORD.equals(CONFIRMPASSWORD)){
//            Intent FromSignupToLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
//            startActivity(FromSignupToLogin);
//        }else{
//            ErrorMessage.setText("Passwords are not matching");
//        }
//    }
}
