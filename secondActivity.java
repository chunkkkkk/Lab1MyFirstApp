package edu.uw.tcss450.uwnetid.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView rv_str;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        rv_str= (TextView)findViewById(R.id.rv_1);
        Intent intent = getIntent();
        String str = intent.getStringExtra("extra_data");
        rv_str.setText(str);

    }
}