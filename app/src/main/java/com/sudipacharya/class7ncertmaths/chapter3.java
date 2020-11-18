package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter3 extends AppCompatActivity {
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





        chapter5.setVisibility(View.GONE);
        chapter6.setVisibility(View.GONE);
        chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);


        chapter1.setText("1. Data Handling");
        chapter2.setText("2. Data Handling");
        chapter3.setText("3. Data Handling");
        chapter4.setText("4. Data Handling");
        chapter5.setText("5. Data Handling");
        chapter6.setText("6. Data Handling");
        chapter7.setText("7. Data Handling");
        chapter8.setText("8. Data Handling");
        chapter9.setText("9. Data Handling");



        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter3i();
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


    public void chapter3a(){
        url = "3.1.pdf";
        showpdf(url);
    }

    public void chapter3b(){
        url = "3.2.pdf";
        showpdf(url);
    }

    public void chapter3c(){
        url = "3.3.pdf";
        showpdf(url);
    }

    public void chapter3d(){
        url = "3.4.pdf";
        showpdf(url);
    }

    public void chapter3e(){
        url = "3.5.pdf";
        showpdf(url);
    }

    public void chapter3f(){
        url = "3.6.pdf";
        showpdf(url);
    }

    public void chapter3g(){
        url = "3.7.pdf";
        showpdf(url);
    }
    public void chapter3h(){
        url = "3.8.pdf";
        showpdf(url);
    }

    public void chapter3i(){
        url = "3.9.pdf";
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