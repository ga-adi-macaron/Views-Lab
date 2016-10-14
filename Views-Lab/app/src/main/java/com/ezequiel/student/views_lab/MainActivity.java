package com.ezequiel.student.views_lab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mTextView;
    private Button mButtonB;
    private Button mButtonP;
    private Button mButtonG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        mButtonB = (Button) findViewById(R.id.blue);
        mButtonP = (Button) findViewById(R.id.purple);
        mButtonG = (Button) findViewById(R.id.gray);

        mButtonB.setOnClickListener(this);
        mButtonP.setOnClickListener(this);
        mButtonG.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blue:
                mTextView.setText("Blue");
                mTextView.setTextColor(Color.BLUE);
                break;
            case R.id.purple:
                mTextView.setText("Purple");
                mTextView.setTextColor(Color.MAGENTA);
                break;
            case R.id.gray:
                mTextView.setText("Gray");
                mTextView.setTextColor(Color.GRAY);
                break;
        }
    }
}
