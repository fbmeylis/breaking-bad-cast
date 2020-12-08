package com.fbmeylis.breakingbadcast;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<BreakingBad> {
    private ArrayList<BreakingBad> breakingBads;
    private Activity context;

    public CustomAdapter(ArrayList<BreakingBad> breakingBads,Activity context){
        super(context,R.layout.custom_view,breakingBads);
        this.breakingBads = breakingBads;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customview = layoutInflater.inflate(R.layout.custom_view,null,true);

        TextView nameview = customview.findViewById(R.id.customtextview);
        nameview.setText(breakingBads.get(position).getCastname());
        return customview;
    }
}
