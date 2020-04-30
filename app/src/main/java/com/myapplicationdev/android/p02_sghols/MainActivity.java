package com.myapplicationdev.android.p02_sghols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<Holidays> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)this.findViewById(R.id.lv1);
        holidays = new ArrayList<Holidays>();

        holidays.add(new Holidays("Secular"));
        holidays.add(new Holidays("Ethnic and Religion"));

        aa = new HolidayAdapter(this,R.layout.row,holidays);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedHoliday = holidays.get(position);
                String[] info = {selectedHoliday.getName()};
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
