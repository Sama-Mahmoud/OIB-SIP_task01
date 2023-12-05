package com.example.unitconverterapp_task1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //get the spinner from the xml.
        View view = inflater.inflate(R.layout.fragment_firstfragment, container, false);
        Spinner fromDropdown = view.findViewById(R.id.spinner1);
        Spinner toDropdown = view.findViewById(R.id.spinner2);
        TextView restxt = view.findViewById(R.id.txtcont);
        EditText number = view.findViewById(R.id.numetxt);
        Button submit = view.findViewById(R.id.submitbtn);
       // int num = Integer.parseInt(number.getText().toString());

//create a list of items for the spinner.
        String[] items = new String[]{"Meter", "Kilo Meter", "Centimeter" , "MiliMeter"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        fromDropdown.setAdapter(adapter);
        toDropdown.setAdapter(adapter);
        //String fromlabel = fromDropdown.getSelectedItem().toString();
       // String tolabel = toDropdown.getSelectedItem().toString();
       // Toast.makeText(view.getContext(), "You selected: " + fromlabel, Toast.LENGTH_LONG).show();



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromval = fromDropdown.getSelectedItem().toString();
                String toval = toDropdown.getSelectedItem().toString();
                double num =0;
                if (number.getText().toString().equals("")){
                    num =0;
                }else {
                 num = Double.parseDouble(number.getText().toString());}

                //"Meter", "Kilo Meter", "Centimeter" , "MiliMeter"
                if(fromval.equals(toval)){
                    restxt.setText("the result is : "+num);
                }else if(fromval.equals(items[0])) {
                    if(toval.equals(items[1])){// m to kilo
                        restxt.setText("the result is : "+num/1000);
                    }
                    if(toval.equals(items[2])){ // m to centi
                        restxt.setText("the result is : "+num*100);
                    }
                    if(toval.equals(items[3])){ // m to milli
                        restxt.setText("the result is : "+num*1000);
                    }
                }else if(fromval.equals(items[1])){

                    if(toval.equals(items[0])){// killo to m
                        restxt.setText("the result is : "+num*1000);
                    }
                    if(toval.equals(items[2])){ // kilo to centi
                        restxt.setText("the result is : "+num*100000);
                    }
                    if(toval.equals(items[3])){ // kilo to milli
                        restxt.setText("the result is : "+num*1000000);
                    }

                }else if(fromval.equals(items[2])){

                    if(toval.equals(items[1])){// centi to kilo
                        restxt.setText("the result is : "+num/100000);
                    }
                    if(toval.equals(items[0])){ // centi to meter
                        restxt.setText("the result is : "+num/100);
                    }
                    if(toval.equals(items[3])){ // centi to milli
                        restxt.setText("the result is : "+num*10);
                    }

                }else if(fromval.equals(items[3])){

                    if(toval.equals(items[1])){// mili to kilo
                        restxt.setText("the result is : "+num/1000000);
                    }
                    if(toval.equals(items[2])){ // milli to centi
                        restxt.setText("the result is : "+num/10);
                    }
                    if(toval.equals(items[0])){ // milli to meter
                        restxt.setText("the result is : "+num/1000);
                    }

                }


            }
        });

        // Toast.makeText(view.getContext(), " second toast You selected: " + fromlabel[0], Toast.LENGTH_LONG).show();

        return view;
    }

}