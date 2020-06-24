package com.gabiest.aion;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class LookActivity extends AppCompatActivity {

//    public Button sendbt;
//
//    public FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//    public DatabaseReference databaseReference = firebaseDatabase.getReference();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look);

//        sendbt = (Button) findViewById(R.id.button17);
//
//        sendbt.setOnClickListener(new OnClickListener() {
//            public void onClick(View v) {
//                databaseReference.child("message").push().setValue("2");
//
//            }
//        });

        WebView containerWebview = (WebView) findViewById(R.id.webView);
        containerWebview.setWebViewClient(new MyWebViewClient());
        String url = "http://m.10x10.co.kr/diarystory2020/?gnbflag=1";
        containerWebview.getSettings().setJavaScriptEnabled(true);
        containerWebview.loadUrl(url); // load a web page in a web view

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
