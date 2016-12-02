package net.madran.bby261.WebView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ekrandaki WebView öğesinin ilişkilendirilmesi

        webView = (WebView) findViewById(R.id.detayWebView);

        //WebView nesnesinin oluşturulması

        webView.setWebViewClient(new WebViewClient());

        //WebView için adres tanımlama

        webView.loadUrl("http://www.madran.net");

    }
}
