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
    String name[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv = (ListView)this.findViewById(R.id.lv2);
        tvDisplayHoliday = (TextView)findViewById(R.id.tvHoliday2);
        Intent i =getIntent();
        //Get the String array named info we passed in
        String[] info = i.getStringArrayExtra("info");
        tvDisplayHoliday.setText(info[0]);

        festives = new ArrayList<Festive>();
        festives.add(new Festive("New Year's Day","1 January 2020",R.drawable.newyear));
        festives.add(new Festive("Labour Day","1 May 2020",R.drawable.work));
        festives.add(new Festive("National Day","9 August 2020",R.drawable.ndp));

        aa = new FestiveAdapter(this,R.layout.row2,festives);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Festive selectedFesitval = festives.get(position);
                Toast.makeText(MainActivity2.this, selectedFesitval.getFestivename()
                                + " : " + selectedFesitval.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
