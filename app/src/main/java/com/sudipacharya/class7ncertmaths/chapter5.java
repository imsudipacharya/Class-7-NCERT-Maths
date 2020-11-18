package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter5 extends AppCompatActivity {
    PDFView pdfView;
    ScrollView subchapters;
    String url;
    Button chapter1,chapter2,chapter3,chapter4,chapter5,chapter6,chapter7,chapter8,chapter9;
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subchapter);

        interstitialAd = new InterstitialAd(this, "1348394542181649_1348407975513639");
        interstitialAd.loadAd();


        chapter1 = findViewById(R.id.subchap1);
        chapter2 = findViewById(R.id.subchap2);
        chapter3 = findViewById(R.id.subchap3);
        chapter4 = findViewById(R.id.subchap4);
        chapter5 = findViewById(R.id.subchap5);
        chapter6 = findViewById(R.id.subchap6);
        chapter7 = findViewById(R.id.subchap7);
        chapter8 = findViewById(R.id.subchap8);
        chapter9 = findViewById(R.id.subchap9);


        chapter3.setVisibility(View.GONE);
        chapter4.setVisibility(View.GONE);
        chapter5.setVisibility(View.GONE);
        chapter6.setVisibility(View.GONE);
        chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);


        chapter1.setText("1. Lines and Angles");
        chapter2.setText("2. Lines and Angles");
        chapter3.setText("3. Lines and Angles");
        chapter4.setText("4. Lines and Angles");
        chapter5.setText("5. Lines and Angles");
        chapter6.setText("6. Lines and Angles");
        chapter7.setText("7. Lines and Angles");
        chapter8.setText("8. Lines and Angles");
        chapter9.setText("9. Lines and Angles");


        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5a();
            }
        });

        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter5i();
            }
        });


    }

    public void showpdf(String url){
        pdfView = findViewById(R.id.pdfView);
        subchapters = findViewById(R.id.subchapters);
        subchapters.setVisibility(View.GONE);
        pdfView.setVisibility(View.VISIBLE);
        pdfView.fromAsset(url)
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .load();


    }


    public void chapter5a(){
        url = "5.1.pdf";
        showpdf(url);
    }

    public void chapter5b(){
        url = "5.2.pdf";
        showpdf(url);
    }

    public void chapter5c(){
        url = "5.3.pdf";
        showpdf(url);
    }

    public void chapter5d(){
        url = "5.4.pdf";
        showpdf(url);
    }

    public void chapter5e(){
        url = "5.5.pdf";
        showpdf(url);
    }

    public void chapter5f(){
        url = "5.6.pdf";
        showpdf(url);
    }

    public void chapter5g(){
        url = "5.7.pdf";
        showpdf(url);
    }
    public void chapter5h(){
        url = "5.8.pdf";
        showpdf(url);
    }

    public void chapter5i(){
        url = "5.9.pdf";
        showpdf(url);
    }


    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()) {
            interstitialAd.show();
        }
        super.onBackPressed();
    }
}