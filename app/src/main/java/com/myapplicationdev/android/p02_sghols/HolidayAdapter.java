package com.myapplicationdev.android.p02_sghols;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class HolidayAdapter extends ArrayAdapter<Holidays> {
    private ArrayList<Holidays> h;
    private Context context;
    private TextView tvHol;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context,resource,objects);
        h = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHol = (TextView)rowView.findViewById(R.id.tvHoliday);
        Holidays currentHoliday = h.get(position);
        tvHol.setText(currentHoliday.getName());
        return rowView;
    }
}
