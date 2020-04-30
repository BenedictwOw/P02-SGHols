package com.myapplicationdev.android.p02_sghols;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    ListView lv;
    TextView tvDisplayHoliday;
    ArrayAdapter aa;
    ArrayList<Festive> festives;
    ArrayList<Festive> festives2;
    String name[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv = (ListView)this.findViewById(R.id.lv2);
        tvDisplayHoliday = (TextView)findViewById(R.id.tvHoliday2);
        final Intent i =getIntent();
        //Get the String array named info we passed in
        final String info = i.getStringExtra("info");
        tvDisplayHoliday.setText(info);

        festives = new ArrayList<Festive>();
        festives.add(new Festive("New Year's Day","1 January 2020",R.drawable.newyear));
        festives.add(new Festive("Labour Day","1 May 2020",R.drawable.work));
        festives.add(new Festive("National Day","9 August 2020",R.drawable.ndp));

        festives2 = new ArrayList<Festive>();
        festives2.add(new Festive("Chinese New Year","25 & 26 January 2020",R.drawable.cny));
        festives2.add(new Festive("Good Friday","10 April 2020",R.drawable.goodf));
        festives2.add(new Festive("Vesak Day","7 May 2020",R.drawable.vesak));
        festives2.add(new Festive("Hari Raya Puasa","24 May 2020",R.drawable.hariraya));
        festives2.add(new Festive("Hari Raya Haji","31 July 2020",R.drawable.harihaji));
        festives2.add(new Festive("Deepavali","14 November 2020",R.drawable.christmas));
        if(info.equalsIgnoreCase("Secular")){{
            aa = new FestiveAdapter(this,R.layout.row2,festives);
        }}else{
            aa = new FestiveAdapter(this,R.layout.row2,festives2);
        }
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Festive selectedFesitval;
                if(info.equalsIgnoreCase("Secular")){{
                    selectedFesitval = festives.get(position);
                }}else{
                    selectedFesitval = festives2.get(position);
                }

                Toast.makeText(MainActivity2.this, selectedFesitval.getFestivename()
                                + " : " + selectedFesitval.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
