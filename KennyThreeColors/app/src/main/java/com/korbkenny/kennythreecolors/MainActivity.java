package com.korbkenny.kennythreecolors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView mTheText = (TextView) findViewById(R.id.TheText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toBlue = (Button) findViewById(R.id.ButtonBlue);
        Button toMagenta = (Button) findViewById(R.id.ButtonMagenta);
        Button toGrey = (Button) findViewById(R.id.ButtonGrey);

        View.OnClickListener blueOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView theText = (TextView) findViewById(R.id.TheText);
                theText.setBackgroundColor(Color.rgb(153, 204, 255));
                theText.setTextColor(Color.BLUE);
                theText.setText("Oh, it looks like\nI'm blue now!");
            }
        };

        View.OnClickListener magentaOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView theText = (TextView) findViewById(R.id.TheText);
                theText.setBackgroundColor(Color.rgb(255, 204, 229));
                theText.setTextColor(Color.MAGENTA);
                theText.setText("Oh, it looks like\nI'm magenta now!");
            }
        };

        View.OnClickListener grayOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView theText = (TextView) findViewById(R.id.TheText);
                theText.setBackgroundColor(Color.rgb(224, 224, 224));
                theText.setTextColor(Color.GRAY);
                theText.setText("Oh, it looks like\nI'm gray now!");
            }
        };

        toBlue.setOnClickListener(blueOnClickListener);
        toMagenta.setOnClickListener(magentaOnClickListener);
        toGrey.setOnClickListener(grayOnClickListener);
    }
}
