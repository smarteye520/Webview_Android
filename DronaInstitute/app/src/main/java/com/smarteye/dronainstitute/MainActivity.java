package com.smarteye.dronainstitute;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    WebView wvFirst, wvSecond, wvThird, wvFourth, wvFifth;
    TextView tvFirst, tvSecond, tvThird, tvFourth, tvFifth;

    int nTabIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        wvFirst = (WebView) findViewById(R.id.webView1);
        wvSecond = (WebView) findViewById(R.id.webView2);
        wvThird = (WebView) findViewById(R.id.webView3);
        wvFourth = (WebView) findViewById(R.id.webView4);
        wvFifth = (WebView) findViewById(R.id.webView5);

        tvFirst = (TextView) findViewById(R.id.tvFirst);
        tvSecond = (TextView) findViewById(R.id.tvSecond);
        tvThird = (TextView) findViewById(R.id.tvThird);
        tvFourth = (TextView) findViewById(R.id.tvFourth);
        tvFifth = (TextView) findViewById(R.id.tvFifth);

        tvFirst.setOnClickListener(this);
        tvSecond.setOnClickListener(this);
        tvThird.setOnClickListener(this);
        tvFourth.setOnClickListener(this);
        tvFifth.setOnClickListener(this);

        wvFirst.getSettings().setJavaScriptEnabled(true);
        wvFirst.getSettings().setLoadsImagesAutomatically(true);
        wvFirst.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvFirst.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvFirst.setWebViewClient(new WebViewClient());
        wvFirst.loadUrl("http://dronaayurveda.com/users/");

        wvSecond.getSettings().setJavaScriptEnabled(true);
        wvSecond.getSettings().setLoadsImagesAutomatically(true);
        wvSecond.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvSecond.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvSecond.setWebViewClient(new WebViewClient());
        wvSecond.loadUrl("https://www.mohtutor.com/");

        wvThird.getSettings().setJavaScriptEnabled(true);
        wvThird.getSettings().setLoadsImagesAutomatically(true);
        wvThird.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvThird.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvThird.setWebViewClient(new WebViewClient());
        wvThird.loadUrl("https://www.mohtutor.com/");

        wvFourth.getSettings().setJavaScriptEnabled(true);
        wvFourth.getSettings().setLoadsImagesAutomatically(true);
        wvFourth.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvFourth.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvFourth.setWebViewClient(new WebViewClient());
        wvFourth.loadUrl("https://www.mohtutor.com/");

        wvFifth.getSettings().setJavaScriptEnabled(true);
        wvFifth.getSettings().setLoadsImagesAutomatically(true);
        wvFifth.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvFifth.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvFifth.setWebViewClient(new WebViewClient());
        wvFifth.loadUrl("https://www.mohtutor.com/");

        nTabIndex = 0;
        toggleWebLink();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvFirst:
                nTabIndex = 0;
                toggleWebLink();
                break;
            case R.id.tvSecond:
                nTabIndex = 1;
                toggleWebLink();
                break;
            case R.id.tvThird:
                nTabIndex = 2;
                toggleWebLink();
                break;
            case R.id.tvFourth:
                nTabIndex = 3;
                toggleWebLink();
                break;
            case R.id.tvFifth:
                nTabIndex = 4;
                toggleWebLink();
                break;
        }
    }

    private void toggleWebLink() {
        tvFirst.setTextColor(Color.parseColor("#000000"));
        tvSecond.setTextColor(Color.parseColor("#000000"));
        tvThird.setTextColor(Color.parseColor("#000000"));
        tvFourth.setTextColor(Color.parseColor("#000000"));
        tvFifth.setTextColor(Color.parseColor("#000000"));

        wvFirst.setVisibility(View.INVISIBLE);
        wvSecond.setVisibility(View.INVISIBLE);
        wvThird.setVisibility(View.INVISIBLE);
        wvFourth.setVisibility(View.INVISIBLE);
        wvFifth.setVisibility(View.INVISIBLE);

        switch (nTabIndex) {
            case 0:
                tvFirst.setTextColor(Color.parseColor("#FFFFFF"));
                wvFirst.setVisibility(View.VISIBLE);
                break;
            case 1:
                tvSecond.setTextColor(Color.parseColor("#FFFFFF"));
                wvSecond.setVisibility(View.VISIBLE);
                break;
            case 2:
                tvThird.setTextColor(Color.parseColor("#FFFFFF"));
                wvThird.setVisibility(View.VISIBLE);
                break;
            case 3:
                tvFourth.setTextColor(Color.parseColor("#FFFFFF"));
                wvFourth.setVisibility(View.VISIBLE);
                break;
            case 4:
                tvFifth.setTextColor(Color.parseColor("#FFFFFF"));
                wvFifth.setVisibility(View.VISIBLE);
                break;
        }
    }
}
