package com.android.myvideo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.rw.videowebview.VideoWebview;

public class MainActivity extends AppCompatActivity {
ImageView share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share= (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                intent.putExtra(Intent.EXTRA_TEXT, "This is my text");
                startActivity(Intent.createChooser(intent, "choose one"));
            }

        });

        VideoWebview videoWebview = (VideoWebview)findViewById(R.id.webview);

        videoWebview.setFullScreenView(getSupportActionBar(), (FrameLayout) findViewById(R.id.fullscreen_view));

        videoWebview.loadUrl("http://smartstream.in/suryatv/");

          }

    }

