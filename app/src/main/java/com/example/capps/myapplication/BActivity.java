package com.example.capps.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void openNextActivity(View v){
        
        finish();  //Ok
        startActivity(new Intent(this,CActivity.class));
//        finish(); //Ok

    }
}
