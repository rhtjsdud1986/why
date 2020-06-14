package com.gabiest.aion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    public void goToShopActivity (View view){
        Intent intent = new Intent (this, ShopActivity.class);
        startActivity(intent);
    }
    public void goToNoteActivity (View view){
        Intent intent = new Intent (this, NoteActivity.class);
        startActivity(intent);
    }
    public void goToLookActivity (View view){
        Intent intent = new Intent (this, LookActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


}