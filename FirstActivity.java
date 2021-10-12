package edu.uw.tcss450.uwnetid.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        EditText send = (EditText)findViewById(R.id.EditText_1);
        Button button1 = (Button)findViewById(R.id.Button_1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText String = (EditText)findViewById(R.id.EditText_1);
                String str = send.getText().toString();
                Intent intent = new Intent (FirstActivity.this,secondActivity.class);
                intent.putExtra("extra_data",str);
                startActivity(intent);
            }
        });
    }
}