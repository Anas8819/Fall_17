package com.example.anas.fall_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_layout);
    }
    public void buttonClickMain(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
