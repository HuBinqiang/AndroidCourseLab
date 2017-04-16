package com.hubinqiang.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.lab1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_LAB1");
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.lab2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_LAB2");
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.lab3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_LAB3");
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.lab4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_LAB4");
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.lab5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_LAB5");
                startActivity(intent);
            }
        });
    }
}
