package com.thermofisher.ctd.healthrhymes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class HealthInformation extends AppCompatActivity {


    String[] knownDiseaseslistItems;
    ListView knownDiseaseList,familyKnownList,deficiencyVitaminList;

    String strAllergy,strSmoker,strAlcohol,strKnownDiseases,strFamilyKnownDiseases,strVitaminDiseases;

    RadioGroup rgAllergy,rgSmoker,rgAlcohol;
    RadioButton radioButton;

    public void setStrAllergy(String strAllergy) {
        this.strAllergy = strAllergy;
    }

    public void setStrSmoker(String strSmoker) {
        this.strSmoker = strSmoker;
    }

    public void setStrAlcohol(String strAlcohol) {
        this.strAlcohol = strAlcohol;
    }

    public void setStrKnownDiseases(String strKnownDiseases) {
        this.strKnownDiseases = strKnownDiseases;
    }

    public void setStrFamilyKnownDiseases(String strFamilyKnownDiseases) {
        this.strFamilyKnownDiseases = strFamilyKnownDiseases;
    }

    public void setStrVitaminDiseases(String strVitaminDiseases) {
        this.strVitaminDiseases = strVitaminDiseases;
    }

    public String getStrAllergy() {
        return strAllergy;
    }

    public String getStrSmoker() {
        return strSmoker;
    }

    public String getStrAlcohol() {
        return strAlcohol;
    }

    public String getStrKnownDiseases() {
        return strKnownDiseases;
    }

    public String getStrFamilyKnownDiseases() {
        return strFamilyKnownDiseases;
    }

    public String getStrVitaminDiseases() {
        return strVitaminDiseases;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_health);

        rgAllergy = (RadioGroup)findViewById(R.id.rdbBtnGrp1);
        rgSmoker = (RadioGroup)findViewById(R.id.rdbBtnGrp2);
        rgAlcohol = (RadioGroup)findViewById(R.id.rdbBtnGrp3);

        knownDiseaseList = (ListView)findViewById(R.id.knownList);
        knownDiseaseList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.knownDiseasesArr);
        ArrayAdapter<String> knownDiseaseAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        knownDiseaseList.setAdapter(knownDiseaseAdapter);
        knownDiseaseList.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });

        familyKnownList = (ListView)findViewById(R.id.familyknownList);
        familyKnownList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.familyKnownDiseasesArr);
        ArrayAdapter<String> familyKnownAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        familyKnownList.setAdapter(familyKnownAdapter);
        familyKnownList.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });

        knownDiseaseList = (ListView)findViewById(R.id.deficiencyVitamins);
        knownDiseaseList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        knownDiseaseslistItems = getResources().getStringArray(R.array.vitaminDefArr);
        ArrayAdapter<String> deficiencyVitaminAdapter = new ArrayAdapter<String>(this,R.layout.multipleitemselection,R.id.txt_mul_lst,knownDiseaseslistItems);
        knownDiseaseList.setAdapter(deficiencyVitaminAdapter);
        knownDiseaseList.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });
    }


    public void displayProteinIntake(View v) {

        loadValuesSelected();

        Intent intent = new Intent(this,ProteinIntake.class);
        startActivity(intent);

    }

    private void loadValuesSelected()
    {
        radioButton = (RadioButton)findViewById(rgAllergy.getCheckedRadioButtonId());
        setStrAllergy(radioButton.getText().toString());

        radioButton = (RadioButton)findViewById(rgSmoker.getCheckedRadioButtonId());
        setStrSmoker(radioButton.getText().toString());

        radioButton = (RadioButton)findViewById(rgAlcohol.getCheckedRadioButtonId());
        setStrAlcohol(radioButton.getText().toString());

        //setStrKnownDiseases(knownDiseaseList.getSelectedItem().toString());

//        System.out.println(getStrAllergy());
//        System.out.println(getStrSmoker());
//        System.out.println(getStrAlcohol());

        System.out.println(getStrKnownDiseases());

    }


    private String getTextFroMultiListView(ListView lstView, String deliminiter)
    {
        String items="";
        int len = lstView.getCount();
        SparseBooleanArray checked = lstView.getCheckedItemPositions();
        for(int i=0;i<len;i++)
        {
            if(checked.get(i))
            {
                if(items.equalsIgnoreCase(""))
                {
                   // items = lstView.get();
                }
            }
        }

        return items;
    }

}
