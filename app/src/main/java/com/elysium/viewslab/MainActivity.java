package com.elysium.viewslab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextView = (TextView) findViewById(R.id.textToChange);

        Button button1 = (Button) findViewById(R.id.buttonOne);
        Button button2 = (Button) findViewById(R.id.buttonTwo);
        Button button3 = (Button) findViewById(R.id.buttonThree);


        View.OnClickListener myOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.buttonOne:
                        mTextView.setTextColor(Color.RED);
                        break;
                    case R.id.buttonTwo:
                        mTextView.setTextColor(Color.CYAN);
                        break;
                    case R.id.buttonThree:
                        mTextView.setTextColor(Color.YELLOW);
                        break;

                }
            }
        };
        button1.setOnClickListener(myOnClick);
        button2.setOnClickListener(myOnClick);
        button3.setOnClickListener(myOnClick);
    }
}
