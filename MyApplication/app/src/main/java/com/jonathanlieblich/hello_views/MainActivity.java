package com.jonathanlieblich.hello_views;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBlueButton;
    private Button mMagentaButton;
    private Button mGrayButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.colorName);

        mBlueButton = (Button) findViewById(R.id.blue);
        mGrayButton = (Button) findViewById(R.id.gray);
        mMagentaButton = (Button) findViewById(R.id.magenta);

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("blue");
                mTextView.setTextColor(Color.BLUE);
                mTextView.setBackgroundColor(Color.BLACK);
            }
        });
        mGrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("gray");
                mTextView.setTextColor(Color.GRAY);
                mTextView.setBackgroundColor(Color.WHITE);
            }
        });
        mMagentaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("magenta");
                mTextView.setTextColor(Color.MAGENTA);
                mTextView.setBackgroundColor(Color.LTGRAY);
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.blue:
//                mTextView.setTextColor(Color.BLUE);
//                mTextView.setText("blue");
//                mTextView.setBackgroundColor(Color.BLACK);
//                break;
//            case R.id.gray:
//                mTextView.setTextColor(Color.GRAY);
//                mTextView.setText("gray");
//                mTextView.setBackgroundColor(Color.GREEN);
//                break;
//            case R.id.magenta:
//                mTextView.setTextColor(Color.MAGENTA);
//                mTextView.setText("magenta");
//                mTextView.setBackgroundColor(Color.LTGRAY);
//                break;
//        }
//    }
}
