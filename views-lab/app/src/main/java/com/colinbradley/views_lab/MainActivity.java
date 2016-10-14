package com.colinbradley.views_lab;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mText;
    private Button mRedButton;
    private Button mBlueButton;
    private Button mGreenButton;
    private Button mGreyButton;
    private Button mYellowButton;
    private Button mOrangeButton;
    private Button mWhiteButton;
    private Button mPurpleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);
        mBlueButton = (Button) findViewById(R.id.blueButton);
        mGreenButton = (Button) findViewById(R.id.greenButton);
        mGreyButton = (Button) findViewById(R.id.greyButton);
        mOrangeButton = (Button) findViewById(R.id.orangeButton);
        mRedButton = (Button) findViewById(R.id.redButton);
        mYellowButton = (Button) findViewById(R.id.yellowButton);
        mWhiteButton = (Button) findViewById(R.id.whiteButton);
        mPurpleButton = (Button) findViewById(R.id.purpleButton);

        mOrangeButton.setOnClickListener(this);
        mPurpleButton.setOnClickListener(this);
        mGreyButton.setOnClickListener(this);
        mWhiteButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);
        mYellowButton.setOnClickListener(this);
        mRedButton.setOnClickListener(this);
        mBlueButton.setOnClickListener(this);


    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.redButton:
                mText.setTextColor(Color.RED);
                mText.setText("Hey now its RED");
                break;
            case R.id.blueButton:
                mText.setTextColor(Color.BLUE);
                mText.setText("Woah...cool BLUE");
                break;
            case R.id.greenButton:
                mText.setTextColor(Color.GREEN);
                mText.setText("GREEN is my favorite");
                break;
            case R.id.greyButton:
                mText.setTextColor(Color.GRAY);
                mText.setText("Boring old GRAY");
                break;
            case R.id.yellowButton:
                mText.setTextColor(Color.YELLOW);
                mText.setText("Its YELLOW now");
                break;
            case R.id.orangeButton:
                mText.setTextColor(Color.CYAN);
                mText.setText(":/ Hey that's not ORANGE...");
                break;
            case R.id.whiteButton:
                mText.setTextColor(Color.WHITE);
                mText.setText("Barely visible WHITE");
                break;
            case R.id.purpleButton:
                mText.setTextColor(Color.MAGENTA);
                mText.setText("PPPPUURRRPPPPLLLEEEE!!");
                break;
        }
    }




}
