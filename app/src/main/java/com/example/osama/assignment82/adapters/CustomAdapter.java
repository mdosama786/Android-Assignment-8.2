package com.example.osama.assignment82.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.osama.assignment82.R;

import java.util.ArrayList;

/**
 * Created by Osama on 05-17-2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;

    ArrayList<CustomHandler>data;

    LayoutInflater inflater;

    public CustomAdapter (Context context,ArrayList<CustomHandler>data){
        this.context=context;
        this.data=data;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.row, parent, false);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.textView);
            holder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);

        }
        else {
            holder=(ViewHolder)convertView.getTag();
        }
        holder.textView.setText(data.get(position).getName());
        holder.textView2.setText(data.get(position).getNumber());
        return convertView;
    }
    public  class ViewHolder{
        TextView textView;
        TextView textView2;
    }
}
