package com.hubinqiang.lab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Lab3MenuActivity extends AppCompatActivity {

    TextView menu_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_menu);

        menu_text = (TextView) findViewById(R.id.menu_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lab3_menu_settings, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_text_size_small:
                menu_text.setTextSize(10*2);
                break;
            case R.id.menu_text_size_middle:
                menu_text.setTextSize(20*2);
                break;
            case R.id.menu_text_size_big:
                menu_text.setTextSize(30*2);
                break;
            case R.id.menu_normal:
                Toast.makeText(this, R.string.menu_normal, Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_text_color_black:
                menu_text.setTextColor(Color.BLACK);
                break;
            case R.id.menu_text_color_red:
                menu_text.setTextColor(Color.RED);
                break;
            default:
                break;
        }
        return true;
    }
}
