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
    ListView knownDiseaseList,familyKnownList,deficiencyVitaminList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_health);



        knownDiseaseList = (ListView)findViewById(R.id.knownList);
        knownDiseaseList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.knownDiseasesArr);
        ArrayAdapter<String> knownDiseaseAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        knownDiseaseList.setAdapter(knownDiseaseAdapter);

        familyKnownList = (ListView)findViewById(R.id.familyknownList);
        familyKnownList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.familyKnownDiseasesArr);
        ArrayAdapter<String> familyKnownAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        familyKnownList.setAdapter(familyKnownAdapter);

        knownDiseaseList = (ListView)findViewById(R.id.deficiencyVitamins);
        knownDiseaseList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.vitaminDefArr);
        ArrayAdapter<String> deficiencyVitaminAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        knownDiseaseList.setAdapter(deficiencyVitaminAdapter);
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
