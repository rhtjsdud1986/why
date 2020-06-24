package com.gabiest.aion;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnercg;
    String[] category={"식비","교통비","쇼핑","금융","취미"};
    Button clearbtn;
    EditText ined;
    EditText outed;
    EditText caled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        spinnercg=(Spinner)findViewById(R.id.spinner);
        spinnercg.setOnItemSelectedListener(this);
        ArrayAdapter adapterspinner=new ArrayAdapter(this,android.R.layout.simple_spinner_item,category);
        adapterspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercg.setAdapter(adapterspinner);


        ined=(EditText)findViewById(R.id.inedit);
        outed=(EditText)findViewById(R.id.outedit);
        caled=(EditText)findViewById(R.id.caledit);
        clearbtn=(Button)findViewById(R.id.clearbutton);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ined.setText("");
                outed.setText("");
                caled.setText("");
                Toast.makeText(getApplicationContext(), "모두 지워졌습니다!",Toast.LENGTH_LONG).show();
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), category[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}