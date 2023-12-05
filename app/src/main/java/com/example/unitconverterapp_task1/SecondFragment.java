package com.example.unitconverterapp_task1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {



    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_secondfragment, container, false);
        Button kc = view.findViewById(R.id.kv_to_cs);
        Button kf = view.findViewById(R.id.kv_to_fh);
        Button ck = view.findViewById(R.id.cs_to_kv);
        Button cf = view.findViewById(R.id.cs_tofh);
        Button fk = view.findViewById(R.id.fh_to_kv);
        Button fc = view.findViewById(R.id.fh_to_cs);
        EditText number =view.findViewById(R.id.tempnumtxt);
        TextView restxt = view.findViewById(R.id.restxt);


        kc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+ (num+273));

            }
        });
        kf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+(((num - 273.15)*1.8)+32));



            }
        });

        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+(num-273));


            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+((num *1.8)+32));


            }
        });
        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+(((num - 32)/1.8)+273.15));

            }
        });
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                    num = Double.parseDouble(number.getText().toString());}

                restxt.setText("the result is : "+((num -32)/1.8));


            }
        });
        return view;
    }
}