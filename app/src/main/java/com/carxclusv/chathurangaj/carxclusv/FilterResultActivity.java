package com.carxclusv.chathurangaj.carxclusv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class FilterResultActivity extends AppCompatActivity {

    Button btn;
    Spinner s1,s2,s3,s4,s5,s6,s7,s8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_result);

        s1 = (Spinner) findViewById(R.id.spinner);
        s2 = (Spinner) findViewById(R.id.spinner2);
        s3 = (Spinner) findViewById(R.id.spinner3);
        s4 = (Spinner) findViewById(R.id.spinner4);
        s5 = (Spinner) findViewById(R.id.spinner5);
        s6 = (Spinner) findViewById(R.id.spinner6);
        s7 = (Spinner) findViewById(R.id.spinner7);
        s8 = (Spinner) findViewById(R.id.spinner8);


        List<String> categories = new ArrayList<String>();
        categories.add("filter1");
        categories.add("filter2");
        categories.add("filter3");
        categories.add("filter4");
        categories.add("filter5");
        categories.add("filter6");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        s1.setAdapter(dataAdapter);
        s2.setAdapter(dataAdapter);
        s3.setAdapter(dataAdapter);
        s4.setAdapter(dataAdapter);
        s5.setAdapter(dataAdapter);
        s6.setAdapter(dataAdapter);
        s7.setAdapter(dataAdapter);
        s8.setAdapter(dataAdapter);



        btn = (Button) findViewById(R.id.buttonFilter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),ResultList2.class);
                startActivity(i);
            }
        });
    }
}
