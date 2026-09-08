package com.facepoy.app;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.*;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 private WebView webView;
 @SuppressLint("SetJavaScriptEnabled") public void onCreate(Bundle b) {
  super.onCreate(b); webView=new WebView(this); setContentView(webView);
  WebSettings s=webView.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
  webView.setWebViewClient(new WebViewClient()); webView.loadUrl("https://facepoy.com/");
 }
 @Override public void onBackPressed(){ if(webView.canGoBack()) webView.goBack(); else super.onBackPressed(); }
}