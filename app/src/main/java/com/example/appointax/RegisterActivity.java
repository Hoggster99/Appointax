package com.example.appointax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Email;
    private EditText Phone;
    private EditText Password;
    private EditText cnfPassword;
    private Button Login;
    private TextView Info;
    private int counter = 5;
    private TextView LoginAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Name = (EditText)findViewById(R.id.etUsername);
        Email = (EditText)findViewById(R.id.etEmail);
        Phone = (EditText)findViewById(R.id.etPhone);
        Password = (EditText)findViewById(R.id.etPass);
        cnfPassword = (EditText)findViewById(R.id.etConfirmPass);
        Login = (Button)findViewById(R.id.etButton);
        Info = (TextView)findViewById(R.id.etInfo);
        LoginAgain =(TextView) findViewById(R.id.etLoginAgain);

        LoginAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(LoginIntent);
            }
        });


    }
}
