package net.serkanbal.viewlab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mText;
    private Button mButtonBlue;
    private Button mButtonMagenta;
    private Button mButtonGray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);
        mButtonBlue = (Button) findViewById(R.id.buttonblue);
        mButtonGray = (Button) findViewById(R.id.buttongray);
        mButtonMagenta = (Button) findViewById(R.id.buttonmagenta);

        mText.setOnClickListener(this);
        mButtonBlue.setOnClickListener(this);
        mButtonMagenta.setOnClickListener(this);
        mButtonGray.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonblue:
                mText.setTextColor(Color.BLUE);
                mText.setBackgroundColor(Color.RED);
                mText.setText("BLUE");
                break;
            case R.id.buttongray:
                mText.setTextColor(Color.GRAY);
                mText.setText("GRAY");
                mText.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.buttonmagenta:
                mText.setTextColor(Color.MAGENTA);
                mText.setBackgroundColor(Color.BLACK);
                mText.setText("MAGENTA");
                break;
        }
    }
}
