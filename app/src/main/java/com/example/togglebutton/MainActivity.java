package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ToggleButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton btn=(ToggleButton)findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            Toast.makeText(MainActivity.this,"Bluetooth"+btn.getText().toString(),Toast.LENGTH_LONG).show();


        }

        });

    }
}