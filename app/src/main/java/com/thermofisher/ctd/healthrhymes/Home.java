package com.thermofisher.ctd.healthrhymes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void displayHealthProfilePage(View v) {

        Intent intent = new Intent(this,HealthProfile.class);
        startActivity(intent);

    }
}
