package com.example.appointax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PreviousAppointments extends AppCompatActivity {

    private CheckBox prevappD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_appointments);

        prevappD = (CheckBox) findViewById(R.id.etapp2);

       prevappD.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent prevappDIntent = new Intent(PreviousAppointments.this, PreviousAppointmentsDetails.class);
               startActivity(prevappDIntent);
           }
       });

    }




    }

