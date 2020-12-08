package com.fbmeylis.breakingbadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);

        BreakingBad walterwhite = new BreakingBad("Bryan Cranston","Walter White",R.drawable.walterwhite);
        BreakingBad jesse = new BreakingBad("Aaron Paul", "Jesse Pinkman",R.drawable.jesse);
        BreakingBad mike = new BreakingBad("Jonahtan Banks","Mike Ehrmantraut",R.drawable.mike);
        BreakingBad skylar = new BreakingBad("Anna Gunn","Skylar White",R.drawable.skylar);
        BreakingBad badman = new BreakingBad("Jesse Plemons","Todd Alquist",R.drawable.badman);
        BreakingBad police = new BreakingBad("Dean Norris","Hank Schrader",R.drawable.police);
        BreakingBad saul = new BreakingBad("Bob Odenkirk","Saul Goodman",R.drawable.saul);
        BreakingBad gusfring = new BreakingBad("Giancarlo Esposito","Gus Fring",R.drawable.gusfring);
        final ArrayList<BreakingBad> arrayList = new ArrayList<>();
        arrayList.add(walterwhite);
        arrayList.add(jesse);
        arrayList.add(mike);
        arrayList.add(skylar);
        arrayList.add(saul);
        arrayList.add(gusfring);
        arrayList.add(police);
        arrayList.add(badman);


        CustomAdapter customAdapter = new CustomAdapter(arrayList,MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("selectedcast",arrayList.get(i));
                startActivity(intent);
            }
        });

    }


}