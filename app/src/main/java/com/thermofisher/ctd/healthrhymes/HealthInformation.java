package com.thermofisher.ctd.healthrhymes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class HealthInformation extends AppCompatActivity {


    String[] knownDiseaseslistItems;
    ArrayList<String> selectedItems = new ArrayList<>();
    ListView mulList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_health);



        mulList = (ListView)findViewById(R.id.knownList);
        mulList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.knownDiseasesArr);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        mulList.setAdapter(adapter);
    }


    public void displayProteinIntake(View v) {

        Intent intent = new Intent(this,ProteinIntake.class);
        startActivity(intent);

    }

//    public void showKnownDiseases(View view)
//    {
//
//    }

//    public void showSelectedItems(View view)
//    {
//        String selectedItem=((TextView)view).getText().toString();
//        if(selectedItems.contains((selectedItem)))
//        {
//            selectedItems.remove(selectedItem);  //Uncheck Item
//        }
//        else
//        {
//            selectedItems.add(selectedItem);  //Check Item
//        }
//
//        String items="";
//        for(String item:selectedItems)
//        {
//            items+="-"+item+"\n";
//        }
//        Toast.makeText(this,"You have selected \n"+items,Toast.LENGTH_LONG).show();
//    }
}
