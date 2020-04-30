package com.myapplicationdev.android.p02_sghols;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FestiveAdapter extends ArrayAdapter<Festive> {

    private ArrayList<Festive> festives;
    private Context context;
    private TextView tvHol,tvDay,tvDate;
    private ImageView ivImage;

    public FestiveAdapter(Context context, int resource, ArrayList<Festive> objects){
        super(context, resource, objects);
        festives = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        tvHol = (TextView)rowView.findViewById(R.id.tvFestive);
        tvDate = (TextView)rowView.findViewById(R.id.tvDate);
        ivImage = (ImageView)rowView.findViewById(R.id.ivHol);
        Festive currentFestive = festives.get(position);
        tvHol.setText(currentFestive.getFestivename());
        tvDate.setText(currentFestive.getDate());
        ivImage.setImageResource(currentFestive.getImage());

        return rowView;
    }
}
