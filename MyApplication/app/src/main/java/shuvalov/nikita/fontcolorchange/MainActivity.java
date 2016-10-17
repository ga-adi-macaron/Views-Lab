package shuvalov.nikita.fontcolorchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button blueButt;
    Button magButt;
    Button greyButt;

    TextView textView;

    int alph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alph=60;

        textView = (TextView)findViewById(R.id.manipulable);

        blueButt = (Button)findViewById(R.id.blueButt);
        magButt = (Button)findViewById(R.id.magentaButt);
        greyButt = (Button)findViewById(R.id.gandalfTheGreyButt);

        blueButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alph-=10;
                if(alph<0){
                    alph=0;
                }
                textView.setText(R.string.blue);
                textView.setTextColor(Color.BLUE);
                textView.setBackgroundColor(Color.RED);
            }
        });

        magButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(R.string.magenta);
                textView.setTextColor(Color.MAGENTA);
                textView.setBackgroundColor(Color.argb(255,126,180,126));
            }
        });

        greyButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alph+=5;
                if(alph>255){
                    alph=255;
                }
                textView.setText(R.string.grey);
                textView.setTextColor(Color.GRAY);
                textView.setBackgroundColor(Color.argb(alph,0,10,200));

            }
        });
    }
}
