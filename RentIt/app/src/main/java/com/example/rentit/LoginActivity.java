package com.example.rentit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private TextView HelpInPassword, ErrorMessage;
    private Button NoAccount;

//    Databasehelper Database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        HelpInPassword = (TextView)findViewById(R.id.forgetpassword);
        ErrorMessage = (TextView)findViewById(R.id.errormessage);

        NoAccount = (Button)findViewById(R.id.noaccount);
        NoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View register) {
                Intent FromLoginToSignin = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(FromLoginToSignin);


            }
        });
    }


    public void validation(View view) {

        String USERNAME = username.getText().toString();
        String PASSWORD = password.getText().toString();

        if ((USERNAME.isEmpty())&&(PASSWORD.isEmpty())){
            ErrorMessage.setText("Please insert USERNAME and PASSWORD");
            HelpInPassword.setText(" ");
        }else if (USERNAME.isEmpty()) {
            ErrorMessage.setText("Please insert USERNAME");
            HelpInPassword.setText(" ");
        }else if (PASSWORD.isEmpty()){
            ErrorMessage.setText("Please insert PASSWORD");
            HelpInPassword.setText(" ");
        }else if ((USERNAME.equals("Gaman")) && (PASSWORD.equals("g12"))){
            Intent FromLoginToHome = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(FromLoginToHome);
        }else{
            ErrorMessage.setText("Invalid Username or Password");
            HelpInPassword.setText("Forget Password?");
        }
    }
}
