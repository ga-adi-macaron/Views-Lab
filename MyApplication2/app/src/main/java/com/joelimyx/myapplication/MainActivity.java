package com.joelimyx.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mColorText;
    private Button mBlueButton;
    private Button mMagentaButton;
    private Button mGrayButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorText = (TextView) findViewById(R.id.colorText);
        mBlueButton= (Button) findViewById(R.id.blueButton);
        mMagentaButton= (Button) findViewById(R.id.magentaButton);
        mGrayButton= (Button) findViewById(R.id.grayButton);

        mBlueButton.setOnClickListener(this);
        mMagentaButton.setOnClickListener(this);
        mGrayButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blueButton:
                mColorText.setText("Blue");
                mColorText.setTextColor(Color.BLUE);
                mColorText.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.magentaButton:
                mColorText.setText("Magenta");
                mColorText.setTextColor(Color.MAGENTA);
                mColorText.setBackgroundColor(Color.LTGRAY);
                break;
            case R.id.grayButton:
                mColorText.setText("Gray");
                mColorText.setTextColor(Color.GRAY);
                mColorText.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
}
