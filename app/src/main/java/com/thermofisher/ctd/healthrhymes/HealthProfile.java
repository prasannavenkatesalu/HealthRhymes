package com.thermofisher.ctd.healthrhymes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class HealthProfile extends AppCompatActivity {

    TableLayout tblHealthProfile;
    int totalEntries = 9;
    String[] healthProfileList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_profile);

        tblHealthProfile = (TableLayout) findViewById(R.id.tblHealthProfile);
        healthProfileList = getResources().getStringArray(R.array.healthProfileArr);

        initProteinTable();

    }

    private void initProteinTable() {
        String emptySpaces = "          ";

        TableRow.LayoutParams tlp = new TableRow.LayoutParams(10,40);
        TableRow.LayoutParams tlp2 = new TableRow.LayoutParams(5,5);
        TableRow row = new TableRow(this);

//        TextView tv0 = new TextView(this);
//        tv0.setText("Food Types"+ emptySpaces+emptySpaces+emptySpaces);
//        tv0.setTextColor(Color.BLUE);
//        // tv0.setLayoutParams(tlp);
//        row.addView(tv0);
//
//        TextView tv1 = new TextView(this);
//        tv1.setText("Protein Amount/Day");
//        tv1.setTextColor(Color.BLUE);
//        tv1.setVisibility(View.GONE);
//        row.addView(tv1);
//
//        TextView tv2 = new TextView(this);
//        tv2.setText("Enter Amount/Week");
//        tv2.setTextColor(Color.BLUE);
//        //tv2.setLayoutParams(tlp);
//        row.addView(tv2);
//
//
//        TextView tv3 = new TextView(this);
//        tv3.setText("Users input Calculation");
//        tv3.setTextColor(Color.BLUE);
//        tv3.setVisibility(View.GONE);
//        row.addView(tv3);
//        tblProtein.addView(row);

        int j=0;
        for(int i = 0; i< totalEntries; i++)
        {
            TableRow tbrow = new TableRow(this);
           // if(i%2==0) {

                TextView t1v = new TextView(this);
                t1v.setText(healthProfileList[j]);
                t1v.setTextColor(Color.BLUE);
                t1v.setGravity(Gravity.LEFT);
                t1v.setBackgroundResource(R.drawable.cell_shape);
                tbrow.addView(t1v);


                TextView t2v = new TextView(this);
                t2v.setText("B_" + i);
                t2v.setTextColor(Color.BLUE);
                t2v.setGravity(Gravity.LEFT);
                t2v.setBackgroundResource(R.drawable.cell_shape);
                tbrow.addView(t2v);

//            }
//            else
//            {
//                TextView tEmpty1 = new TextView(this);
//                TextView tEmpty2 = new TextView(this);
//
//
//                tEmpty1.setText("");
//                tEmpty2.setText("");
//
//
//                tbrow.addView(tEmpty1);
//                tbrow.addView(tEmpty2);


         //   }
            j++;
            tblHealthProfile.addView(tbrow);
        }

    }


}
