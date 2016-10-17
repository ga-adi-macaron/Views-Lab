package com.justinwells.viewlab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mGrey, mBlue, mPurple;
    private TextView textView;
    private boolean grey = false, blue = true, purple = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        mBlue = (Button) findViewById(R.id.blue_button);
        mGrey = (Button) findViewById(R.id.grey_button);
        mPurple = (Button) findViewById(R.id.purple_button);

        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("BLUE!");
                textView.setTextColor(Color.BLUE);
                if (blue) {
                    Toast.makeText(getApplicationContext(),"Already blue!!!", Toast.LENGTH_SHORT).show();
                }
                blue = true;
            }
        });

        mGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("GREY!");
                textView.setTextColor(Color.GRAY);
                if (grey){
                    Toast.makeText(getApplicationContext(),"Already grey!!!", Toast.LENGTH_SHORT).show();
                }
                grey = true;
            }
        });

        mPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("PURPLE!");
                textView.setTextColor(Color.MAGENTA);
                if (purple) {
                    Toast.makeText(getApplicationContext(),"Already purple!!!", Toast.LENGTH_SHORT).show();
                }
                purple = true;
            }
        });

    }
}
