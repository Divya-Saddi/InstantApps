package org.futurebrains.store.store.activities;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import org.futurebrains.store.store.R;

public class WebActivity extends AppCompatActivity
{  private WebView mWebView;
   private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        findViewById();
        url = getIntent().getStringExtra("url");

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView.loadUrl(url);
    }

    private void findViewById()
    {  mWebView = (WebView) findViewById(R.id.myWebView);
    }
}
