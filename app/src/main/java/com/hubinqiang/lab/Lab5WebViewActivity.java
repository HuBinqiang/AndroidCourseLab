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

    private WebView webView;

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

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) findViewById(R.id.edit_webview);
                //url = editText.getText().toString();

                url = "http://www.baidu.com";
                webView = (WebView) findViewById(R.id.webview);

                //声明WebSettings子类
                WebSettings webSettings = webView.getSettings();

                //如果访问的页面中要与Javascript交互，则webview必须设置支持Javascript
                webSettings.setJavaScriptEnabled(true);


                //设置自适应屏幕，两者合用
                webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
                webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小

                //缩放操作
                webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
                webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
                webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件

                //其他细节操作
                webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //关闭webview中缓存
                webSettings.setAllowFileAccess(true); //设置可以访问文件
                webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
                webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
                webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式
                webView.loadUrl(url);

                webView.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                        view.loadUrl(url);
                        return true;
                    }
                });


            }
        });


    }
}
