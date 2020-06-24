package com.gabiest.aion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlannerActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);


        Button b = (Button)findViewById(R.id.plusButton);
        final TextView tv = (TextView)findViewById(R.id.completeText);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String result = "";
                if(cb1.isChecked() == true) result += cb1.getText().toString();
                if(cb2.isChecked() == true) result += cb2.getText().toString();
                if(cb3.isChecked() == true) result += cb3.getText().toString();
                if(cb4.isChecked() == true) result += cb4.getText().toString();
                if(cb5.isChecked() == true) result += cb5.getText().toString();
                if(cb6.isChecked() == true) result += cb6.getText().toString();

                tv.setText(result+"");

            }
        });

    }
}


