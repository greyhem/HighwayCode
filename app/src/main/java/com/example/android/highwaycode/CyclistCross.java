package com.example.android.highwaycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CyclistCross extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cyclist_cross);


        ImageView i = (ImageView) findViewById(R.id.close_icon);

        i.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }


        });
    }
}
