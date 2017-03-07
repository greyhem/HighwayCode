package com.example.android.highwaycode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import static android.app.PendingIntent.getActivity;


/**
 * A simple {@link Fragment} subclass.
 */



public class Peds extends Fragment {

    public Peds() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_peds, container, false);


        ImageView i1 = (ImageView) v.findViewById(R.id.pedsimageView1);
        TextView t1 = (TextView) v.findViewById(R.id.pedstextView1);
        ImageView i2 = (ImageView)v.findViewById(R.id.pedsimageView2);
        TextView t2=(TextView)v.findViewById(R.id.pedstextView2);
        i1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PedsGuidance.class);
                startActivity(intent);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PedsGuidance.class);
                startActivity(intent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PedsCross.class);
                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PedsCross.class);
                startActivity(intent);
            }
        });

        return v;
    }

}



