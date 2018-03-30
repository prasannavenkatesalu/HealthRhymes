package com.thermofisher.ctd.healthrhymes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class HealthInformation extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_health);
    }


    public void displayProteinIntake(View v) {
        Intent intent = new Intent(this,ProteinIntake.class);
        startActivity(intent);
    }
}
