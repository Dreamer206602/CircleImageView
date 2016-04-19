package com.tq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tq.roundimagelib.RoundImageView;


public class MainActivity extends AppCompatActivity {

    private RoundImageView mRoundImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
