package com.thermofisher.ctd.healthrhymes;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProteinIntake extends AppCompatActivity {

    final int totalColumns = 4;
    TableLayout tblProtein;
    GridView grdProtein;
    String[] array_characters={
            "a","b","c",
            "d","e","f"
    };

    List<String> lstSource = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_intake);

        tblProtein = (TableLayout) findViewById(R.id.tblProtein);
        initProteinTable();
//        setUpList();
//        grdProtein = (GridView) findViewById(R.id.gridProtein);
//        ProteinGridViewAdapter adapter = new ProteinGridViewAdapter(lstSource,this );
//        grdProtein.setAdapter(adapter);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    private void setUpList() {
//        for(String item:array_characters)
//            lstSource.add(item);
//    }

        private void initProteinTable()
        {
            String emptySpaces = "          ";
//            final float scale = getContext().getResources().getDisplayMetrics().density;
//
//            int trHeight = (int) (30 * scale + 0.5f);
//            int trWidth = (int) (67 * scale + 0.5f);
//            ViewGroup.LayoutParams layoutpParams = new ViewGroup.LayoutParams(trWidth, trHeight);
//            tableRow.setLayoutParams(layoutpParams);

            TableRow.LayoutParams tlp = new TableRow.LayoutParams(10,40);
            TableRow.LayoutParams tlp2 = new TableRow.LayoutParams(5,5);
            TableRow row = new TableRow(this);

            TextView tv0 = new TextView(this);
            tv0.setText("Food Types"+ emptySpaces+emptySpaces+emptySpaces);
            tv0.setTextColor(Color.BLUE);
           // tv0.setLayoutParams(tlp);
            row.addView(tv0);

            TextView tv1 = new TextView(this);
            tv1.setText("Protein Amount/Day");
            tv1.setTextColor(Color.BLUE);
            tv1.setVisibility(View.GONE);
            row.addView(tv1);

            TextView tv2 = new TextView(this);
            tv2.setText("Protein Amount/week in gm");
            tv2.setTextColor(Color.BLUE);
            //tv2.setLayoutParams(tlp);
            row.addView(tv2);


            TextView tv3 = new TextView(this);
            tv3.setText("Users input Calculation");
            tv3.setTextColor(Color.BLUE);
            tv3.setVisibility(View.GONE);
            row.addView(tv3);
            tblProtein.addView(row);

            for(int i = 0; i< 8; i++)
            {
                TableRow tbrow = new TableRow(this);
                if(i%2==0) {



                    TextView t1v = new TextView(this);
                    t1v.setText("A_" + i + emptySpaces);
                    t1v.setTextColor(Color.BLUE);
                    t1v.setGravity(Gravity.LEFT);
                    //t1v.setLayoutParams(tlp2);
                    tbrow.addView(t1v);

                    TextView t2v = new TextView(this);
                    t2v.setText("B_" + i);
                    t2v.setTextColor(Color.BLUE);
                    t2v.setGravity(Gravity.LEFT);
                    t2v.setVisibility(View.GONE);
                    tbrow.addView(t2v);

                    String editName = "edit_" + Integer.toString(i);
                    Map<String, Integer> idsMap = new HashMap<String, Integer>();
                    EditText edit1 = new EditText(this);
                    edit1.setId(i);
                    idsMap.put(editName, i);
                    edit1.setText("0.0");
                    edit1.setBackgroundColor(Color.WHITE);
                    edit1.setTextColor(Color.BLUE);

                    //edit1.setLayoutParams(tlp2);
                    tbrow.addView(edit1);

                    TextView t4v = new TextView(this);
                    t4v.setText("C_" + i);
                    t4v.setTextColor(Color.BLUE);
                    t4v.setGravity(Gravity.LEFT);
                    t4v.setVisibility(View.GONE);
                    tbrow.addView(t4v);
                }
                else
                {
                    TextView tEmpty1 = new TextView(this);
                    TextView tEmpty2 = new TextView(this);
                    TextView tEmpty3 = new TextView(this);
                    TextView tEmpty4 = new TextView(this);

                    tEmpty1.setText("");
                    tEmpty2.setText("");
                    tEmpty3.setText("");
                    tEmpty4.setText("");

//                    tEmpty1.setGravity(Gravity.CENTER);
//                    tEmpty2.setGravity(Gravity.CENTER);
//                    tEmpty3.setGravity(Gravity.CENTER);
//                    tEmpty4.setGravity(Gravity.CENTER);

                    tbrow.addView(tEmpty1);
                    tbrow.addView(tEmpty2);
                    tbrow.addView(tEmpty3);
                    tbrow.addView(tEmpty4);

                }
                tblProtein.addView(tbrow);
            }

        }
}
