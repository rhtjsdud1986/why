package com.gabiest.aion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button dBtn = (Button) findViewById(R.id.diary);
        final Button mBtn = (Button) findViewById(R.id.money);
        final Button pBtn = (Button) findViewById(R.id.planner);
        final ImageButton openBtn = (ImageButton) findViewById(R.id.openButton);

        dBtn.setVisibility(View.INVISIBLE);
        mBtn.setVisibility(View.INVISIBLE);
        pBtn.setVisibility(View.INVISIBLE);

        openBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(v==openBtn)
                Toast.makeText(getApplicationContext(), "만들 노트를 골라주세요.",Toast.LENGTH_LONG).show();
                openBtn.setBackgroundResource(R.drawable.notepage);
                dBtn.setVisibility(View.VISIBLE);
                mBtn.setVisibility(View.VISIBLE);
                pBtn.setVisibility(View.VISIBLE);
            }
        });

        dBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "일기를 선택하였습니다.",Toast.LENGTH_LONG).show();
                mBtn.setVisibility(View.INVISIBLE);
                pBtn.setVisibility(View.INVISIBLE);
                Intent goDiaryActivity = new Intent(HomeActivity.this, DiaryActivity.class);
                startActivity(goDiaryActivity);

            }

        });
        mBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "가계부를 선택하였습니다.",Toast.LENGTH_LONG).show();
                dBtn.setVisibility(View.INVISIBLE);
                pBtn.setVisibility(View.INVISIBLE);
                Intent goMoneyActivity = new Intent(HomeActivity.this, MoneyActivity.class);
                startActivity(goMoneyActivity);
            }
        });
        pBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "플래너를 선택하였습니다.",Toast.LENGTH_LONG).show();
                dBtn.setVisibility(View.INVISIBLE);
                mBtn.setVisibility(View.INVISIBLE);
                Intent goPlannerActivity = new Intent(HomeActivity.this, PlannerActivity.class);
                startActivity(goPlannerActivity);
            }
        });


    }





    public void goToHomeActivity (View view){
        Intent goHome = new Intent (this, HomeActivity.class);
        startActivity(goHome);
    }
    public void goToShopActivity (View view){
        Intent goShop = new Intent (this, ShopActivity.class);
        startActivity(goShop);
    }
    public void goToLookActivity (View view){
        Intent goLook = new Intent (this, LookActivity.class);
        startActivity(goLook);
    }



}