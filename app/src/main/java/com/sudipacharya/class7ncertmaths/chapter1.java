package com.sudipacharya.class7ncertmaths;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.github.barteksc.pdfviewer.PDFView;

public class chapter1 extends AppCompatActivity {
    PDFView pdfView;
    ScrollView subchapters;
    String url;
    Button chapter1, chapter2, chapter3, chapter4, chapter5, chapter6, chapter7, chapter8, chapter9;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subchapter);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "1348394542181649_1348407498847020");
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

        chapter1.setText("1. Integers");
        chapter2.setText("2. Integers");
        chapter3.setText("3. Integers");
        chapter4.setText("4. Integers");
        chapter5.setText("5. Integers");
        chapter6.setText("6. Integers");
        chapter7.setText("7. Integers");
        chapter8.setText("8. Integers");
        chapter9.setText("9. Integers");


        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1a();
            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1b();
            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1c();
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1d();
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1e();
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1f();
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1g();
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1h();
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter1i();
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


    public void chapter1a() {
        url = "1.1.pdf";
        showpdf(url);
    }

    public void chapter1b() {
        url = "1.2.pdf";
        showpdf(url);
    }

    public void chapter1c() {
        url = "1.3.pdf";
        showpdf(url);
    }

    public void chapter1d() {
        url = "1.4.pdf";
        showpdf(url);
    }

    public void chapter1e() {
        url = "1.5.pdf";
        showpdf(url);
    }

    public void chapter1f() {
        url = "1.6.pdf";
        showpdf(url);
    }

    public void chapter1g() {
        url = "1.7.pdf";
        showpdf(url);
    }

    public void chapter1h() {
        url = "1.8.pdf";
        showpdf(url);
    }

    public void chapter1i() {
        url = "1.9.pdf";
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