package com.example.android.highwaycode;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
/**
 * Created by user on 3/15/2016.
 */
public class PedsCross  extends  Activity{
    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peds_cross);

        ImageView i = (ImageView) findViewById(R.id.close_icon);

        i.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }


        });
    }
}