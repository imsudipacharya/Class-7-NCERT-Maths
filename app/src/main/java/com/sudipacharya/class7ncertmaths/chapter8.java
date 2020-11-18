package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter8 extends AppCompatActivity {
    PDFView pdfView;
    ScrollView subchapters;
    String url;
    Button chapter1,chapter2,chapter3,chapter4,chapter5,chapter6,chapter7,chapter8,chapter9;
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subchapter);

        interstitialAd = new InterstitialAd(this, "1348394542181649_1348407725513664");
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

        chapter1.setText("1. Comparing Quantities");
        chapter2.setText("2. Comparing Quantities");
        chapter3.setText("3. Comparing Quantities");
        chapter4.setText("4. Comparing Quantities");
        chapter5.setText("5. Comparing Quantities");
        chapter6.setText("6. Comparing Quantities");
        chapter7.setText("7. Comparing Quantities");
        chapter8.setText("8. Comparing Quantities");
        chapter9.setText("9. Comparing Quantities");



        chapter4.setVisibility(View.GONE);
        chapter5.setVisibility(View.GONE);
        chapter6.setVisibility(View.GONE);
        chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter8i();
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


    public void chapter8a(){
        url = "8.1.pdf";
        showpdf(url);
    }

    public void chapter8b(){
        url = "8.2.pdf";
        showpdf(url);
    }

    public void chapter8c(){
        url = "8.3.pdf";
        showpdf(url);
    }

    public void chapter8d(){
        url = "8.4.pdf";
        showpdf(url);
    }

    public void chapter8e(){
        url = "8.5.pdf";
        showpdf(url);
    }

    public void chapter8f(){
        url = "8.6.pdf";
        showpdf(url);
    }

    public void chapter8g(){
        url = "8.7.pdf";
        showpdf(url);
    }
    public void chapter8h(){
        url = "8.8.pdf";
        showpdf(url);
    }

    public void chapter8i(){
        url = "8.9.pdf";
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