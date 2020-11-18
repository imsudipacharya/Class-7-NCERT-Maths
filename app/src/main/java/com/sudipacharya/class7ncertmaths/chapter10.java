package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter10 extends AppCompatActivity {
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

        chapter1.setText("1. Practical Geometry");
        chapter2.setText("2. Practical Geometry");
        chapter3.setText("3. Practical Geometry");
        chapter4.setText("4. Practical Geometry");
        chapter5.setText("5. Practical Geometry");
        chapter6.setText("6. Practical Geometry");
        chapter7.setText("7. Practical Geometry");
        chapter8.setText("8. Practical Geometry");
        chapter9.setText("9. Practical Geometry");


         chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter10i();
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


    public void chapter10a(){
        url = "10.1.pdf";
        showpdf(url);
    }

    public void chapter10b(){
        url = "10.2.pdf";
        showpdf(url);
    }

    public void chapter10c(){
        url = "10.3.pdf";
        showpdf(url);
    }

    public void chapter10d(){
        url = "10.4.pdf";
        showpdf(url);
    }

    public void chapter10e(){
        url = "10.5.pdf";
        showpdf(url);
    }

    public void chapter10f(){
        url = "10.6.pdf";
        showpdf(url);
    }

    public void chapter10g(){
        url = "10.7.pdf";
        showpdf(url);
    }
    public void chapter10h(){
        url = "10.8.pdf";
        showpdf(url);
    }

    public void chapter10i(){
        url = "10.9.pdf";
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