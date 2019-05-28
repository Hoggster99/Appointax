package com.example.appointax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    private Button Myapp;
    private Button Mydoc;
    private Button Bookapp;
    private Button Prevapp;
    private Button Myacc;
    private Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Myapp = (Button)findViewById(R.id.etMyAppointments);
        Mydoc = (Button)findViewById(R.id.etMyDoctors);
        Bookapp = (Button)findViewById(R.id.etBookAppointment);
        Prevapp = (Button)findViewById(R.id.etPreviousAppointments);
        Myacc = (Button)findViewById(R.id.etMyAccount);
        Logout = (Button)findViewById(R.id.etLogout);

        Myapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyAppointment = new Intent(SecondActivity.this,MyAppointments.class);
                startActivity(MyAppointment);
            }
        });

        Mydoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyDoctors = new Intent(SecondActivity.this,MyDoctors.class);
                startActivity(MyDoctors);
            }
        });

        Bookapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BookAppointments = new Intent(SecondActivity.this,BookAppointments.class);
                startActivity(BookAppointments);
            }
        });

        Prevapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PrevAppointments = new Intent(SecondActivity.this,PreviousAppointments.class);
                startActivity(PrevAppointments);
            }
        });

        Myacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyAccount = new Intent(SecondActivity.this,MyAccount.class);
                startActivity(MyAccount);
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logout = new Intent(SecondActivity.this,Logout.class);
                startActivity(Logout);
            }
        });





    }
}
