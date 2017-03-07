package com.example.android.highwaycode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cyclist extends Fragment {


    public Cyclist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cyclist, container, false);

        ImageView i1 = (ImageView) v.findViewById(R.id.cycimageView1);
        TextView t1 = (TextView) v.findViewById(R.id.cycstextView1);
        ImageView i2 = (ImageView)v.findViewById(R.id.cycsimaView2);
        TextView t2=(TextView)v.findViewById(R.id.cycstextView2);
        i1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cyclist_cloth.class);
                startActivity(intent);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cyclist_cloth.class);
                startActivity(intent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CyclistCross.class);
                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CyclistCross.class);
                startActivity(intent);
            }
        });

        return v;
    }}

