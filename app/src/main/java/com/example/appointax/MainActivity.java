package com.example.appointax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter = 5;
    private TextView Register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPass);
        Login = (Button)findViewById(R.id.etButton);
        Info = (TextView)findViewById(R.id.etInfo);
        Register = (TextView) findViewById(R.id.etRegister);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });


        Info.setText("Nr of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String username, String userpassword){
        if((username.equals("Jan.Vanhercke")) && (userpassword.equals("wachtwoord123"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else {
            counter--;

            Info.setText("Nr of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
                Info.setText("Login limit exceeded. Wait 10 minutes before trying again.");
            }
            }
    }






}
