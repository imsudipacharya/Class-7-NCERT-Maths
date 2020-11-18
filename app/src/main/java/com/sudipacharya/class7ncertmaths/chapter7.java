package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter7 extends AppCompatActivity {
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


        chapter3.setVisibility(View.GONE);
        chapter4.setVisibility(View.GONE);
        chapter5.setVisibility(View.GONE);
        chapter6.setVisibility(View.GONE);
        chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);

        chapter1.setText("1. Congurence of Triangles");
        chapter2.setText("2. Congurence of Triangles");
        chapter3.setText("3. Congurence of Triangles");
        chapter4.setText("4. Congurence of Triangles");
        chapter5.setText("5. Congurence of Triangles");
        chapter6.setText("6. Congurence of Triangles");
        chapter7.setText("7. Congurence of Triangles");
        chapter8.setText("8. Congurence of Triangles");
        chapter9.setText("9. Congurence of Triangles");


        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter7i();
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


    public void chapter7a(){
        url = "7.1.pdf";
        showpdf(url);
    }

    public void chapter7b(){
        url = "7.2.pdf";
        showpdf(url);
    }

    public void chapter7c(){
        url = "7.3.pdf";
        showpdf(url);
    }

    public void chapter7d(){
        url = "7.4.pdf";
        showpdf(url);
    }

    public void chapter7e(){
        url = "7.5.pdf";
        showpdf(url);
    }

    public void chapter7f(){
        url = "7.6.pdf";
        showpdf(url);
    }

    public void chapter7g(){
        url = "7.7.pdf";
        showpdf(url);
    }
    public void chapter7h(){
        url = "7.8.pdf";
        showpdf(url);
    }

    public void chapter7i(){
        url = "7.9.pdf";
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