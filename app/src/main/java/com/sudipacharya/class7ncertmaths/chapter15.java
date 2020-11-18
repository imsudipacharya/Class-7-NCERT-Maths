package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter15 extends AppCompatActivity {
    PDFView pdfView;
    ScrollView subchapters;
    String url;
    Button chapter1, chapter2, chapter3, chapter4, chapter5, chapter6, chapter7, chapter8, chapter9;
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

        chapter1.setText("1. Visualising Shapes");
        chapter2.setText("2. Visualising Shapes");
        chapter3.setText("3. Visualising Shapes");
        chapter4.setText("4. Visualising Shapes");
        chapter5.setText("5. Visualising Shapes");
        chapter6.setText("6. Visualising Shapes");
        chapter7.setText("7. Visualising Shapes");
        chapter8.setText("8. Visualising Shapes");
        chapter9.setText("9. Visualising Shapes");

        chapter5.setVisibility(View.GONE);
        chapter6.setVisibility(View.GONE);
        chapter7.setVisibility(View.GONE);
        chapter8.setVisibility(View.GONE);
        chapter9.setVisibility(View.GONE);

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15a();
            }
        });

        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter15i();
            }
        });


    }

    public void showpdf(String url) {
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


    public void chapter15a() {
        url = "15.1.pdf";
        showpdf(url);
    }

    public void chapter15b() {
        url = "15.2.pdf";
        showpdf(url);
    }

    public void chapter15c() {
        url = "15.3.pdf";
        showpdf(url);
    }

    public void chapter15d() {
        url = "15.4.pdf";
        showpdf(url);
    }

    public void chapter15e() {
        url = "15.5.pdf";
        showpdf(url);
    }

    public void chapter15f() {
        url = "15.6.pdf";
        showpdf(url);
    }

    public void chapter15g() {
        url = "15.7.pdf";
        showpdf(url);
    }

    public void chapter15h() {
        url = "15.8.pdf";
        showpdf(url);
    }

    public void chapter15i() {
        url = "15.9.pdf";
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