package com.hubinqiang.lab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lab5WebViewActivity extends AppCompatActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_web_view);

        Button button1 = (Button) findViewById(R.id.button1_webview);
        Button button2 = (Button) findViewById(R.id.button2_webview);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) findViewById(R.id.edit_webview);
                url = editText.getText().toString();

                if (url.isEmpty()) {
                    url = "https://hubinqiang.com";
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) findViewById(R.id.edit_webview);
                url = editText.getText().toString();

                if (url.isEmpty()) {
                    url = "https://hubinqiang.com";
                }

                Intent intent = new Intent("com.hubinqiang.lab.ACTION_START_WEBVIEW");
                intent.addCategory("com.hubinqiang.lab.START_WEBVIEW_CATEGORY");

                intent.putExtra("url", url);
                startActivity(intent);

            }
        });


    }
}
