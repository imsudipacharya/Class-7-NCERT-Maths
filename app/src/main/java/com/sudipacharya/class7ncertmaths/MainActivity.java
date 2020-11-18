package com.sudipacharya.class7ncertmaths;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd interstitialAd, interstitialAd1, interstitialAd2, interstitialAd3, interstitialAd4, interstitialAd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, "1348394542181649_1348406992180404");
        interstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd2 = new InterstitialAd(this, "1348394542181649_1348407085513728");
        interstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd3 = new InterstitialAd(this, "1348394542181649_1348407212180382");
        interstitialAd3.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd4 = new InterstitialAd(this, "1348394542181649_1348407302180373");
        interstitialAd4.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd5 = new InterstitialAd(this, "1348394542181649_1348407408847029");
        interstitialAd5.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "1348394542181649_1348394848848285");
        interstitialAd.loadAd();


        final CardView chapter1 = findViewById(R.id.card1);
        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded()) {

                    interstitialAd1.show();
                } else {

                    Intent ppk = new Intent(MainActivity.this, chapter1.class);
                    startActivity(ppk);
                }
            }
        });

        final CardView chapter2 = findViewById(R.id.card2);
        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded()) {

                    interstitialAd2.show();
                } else {

                    Intent ppk = new Intent(MainActivity.this, chapter2.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter3 = findViewById(R.id.card3);
        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded()) {

                    interstitialAd3.show();
                } else {

                    Intent ppk = new Intent(MainActivity.this, chapter3.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter4 = findViewById(R.id.card4);
        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded()) {

                    interstitialAd4.show();
                } else {

                    Intent ppk = new Intent(MainActivity.this, chapter4.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter5 = findViewById(R.id.card5);
        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded()) {

                    interstitialAd5.show();
                } else {

                    Intent ppk = new Intent(MainActivity.this, chapter5.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter6 = findViewById(R.id.card6);
        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded()) {

                    interstitialAd1.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter6.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter7 = findViewById(R.id.card7);
        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded()) {

                    interstitialAd2.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter7.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter8 = findViewById(R.id.card8);
        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded()) {

                    interstitialAd3.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter8.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter9 = findViewById(R.id.card9);
        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded()) {

                    interstitialAd4.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter9.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter10 = findViewById(R.id.card10);
        chapter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded()) {

                    interstitialAd5.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter10.class);
                    startActivity(ppk);
                }
            }
        });

        final CardView chapter11 = findViewById(R.id.card11);
        chapter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded()) {

                    interstitialAd1.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter11.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter12 = findViewById(R.id.card12);
        chapter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded()) {

                    interstitialAd2.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter12.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter13 = findViewById(R.id.card13);
        chapter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded()) {

                    interstitialAd3.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter13.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter14 = findViewById(R.id.card14);
        chapter14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded()) {

                    interstitialAd4.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter14.class);
                    startActivity(ppk);
                }
            }
        });


        final CardView chapter15 = findViewById(R.id.card15);
        chapter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded()) {

                    interstitialAd5.show();
                } else {
                    Intent ppk = new Intent(MainActivity.this, chapter15.class);
                    startActivity(ppk);
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }
}