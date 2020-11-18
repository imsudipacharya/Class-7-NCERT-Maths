package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter2 extends AppCompatActivity {
    PDFView pdfView;
    ScrollView subchapters;
    String url;
    Button chapter1,chapter2,chapter3,chapter4,chapter5,chapter6,chapter7,chapter8,chapter9;
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subchapter);

        interstitialAd = new InterstitialAd(this, "1348394542181649_1348407605513676");
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



        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);


        chapter1.setText("1. Fraction and Decimals");
        chapter2.setText("2. Fraction and Decimals");
        chapter3.setText("3. Fraction and Decimals");
        chapter4.setText("4. Fraction and Decimals");
        chapter5.setText("5. Fraction and Decimals");
        chapter6.setText("6. Fraction and Decimals");
        chapter7.setText("7. Fraction and Decimals");
        chapter8.setText("8. Fraction and Decimals");
        chapter9.setText("9. Fraction and Decimals");



        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter2i();
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


    public void chapter2a(){
        url = "2.2.pdf";
        showpdf(url);
    }

    public void chapter2b(){
        url = "2.2.pdf";
        showpdf(url);
    }

    public void chapter2c(){
        url = "2.3.pdf";
        showpdf(url);
    }

    public void chapter2d(){
        url = "2.4.pdf";
        showpdf(url);
    }

    public void chapter2e(){
        url = "2.5.pdf";
        showpdf(url);
    }

    public void chapter2f(){
        url = "2.6.pdf";
        showpdf(url);
    }

    public void chapter2g(){
        url = "2.7.pdf";
        showpdf(url);
    }
    public void chapter2h(){
        url = "2.8.pdf";
        showpdf(url);
    }

    public void chapter2i(){
        url = "2.9.pdf";
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