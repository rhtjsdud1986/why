package com.gabiest.aion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {


    public void goToHomeActivity (View view){
        Intent intent = new Intent (this, HomeActivity.class);
        startActivity(intent);
    }
    public void goToLookActivity (View view){
        Intent intent = new Intent (this, LookActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }


}