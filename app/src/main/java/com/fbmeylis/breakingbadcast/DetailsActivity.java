package com.fbmeylis.breakingbadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView imageView = findViewById(R.id.imageView);
        TextView realname  = findViewById(R.id.realnameText);
        TextView castname = findViewById(R.id.actorrnameText);

        Intent intent = getIntent();
        BreakingBad selectedcast = (BreakingBad) intent.getSerializableExtra("selectedcast");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedcast.getPictureid());
        imageView.setImageBitmap(bitmap);
        realname.setText(selectedcast.getRealname());
        castname.setText(selectedcast.getCastname());
    }
}