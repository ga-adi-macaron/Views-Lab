package com.scottlindley.viewslab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBlueButton;
    private Button mMagentaButton;
    private Button mGreyButton;
    private TextView mColorText;
    private ImageView mTopPannel;
    private ImageView mLeftPannel;
    private ImageView mRightPannel;
    private ImageView mBottomPannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBlueButton = (Button)findViewById(R.id.blue_button);
        mMagentaButton = (Button)findViewById(R.id.magenta_button);
        mGreyButton = (Button)findViewById(R.id.grey_button);
        mColorText = (TextView)findViewById(R.id.color_text);
        mTopPannel = (ImageView)findViewById(R.id.top_pannel);
        mLeftPannel = (ImageView)findViewById(R.id.left_pannel);
        mRightPannel = (ImageView)findViewById(R.id.right_pannel);
        mBottomPannel = (ImageView)findViewById(R.id.bottom_panel);
        mBlueButton.setOnClickListener(this);
        mMagentaButton.setOnClickListener(this);
        mGreyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.blue_button:
                mColorText.setText("Blue");
                mColorText.setTextColor(Color.rgb(35,53,187));
                mTopPannel.setBackgroundColor(Color.rgb(35,53,187));
                mLeftPannel.setBackgroundColor(Color.rgb(35,53,187));
                mRightPannel.setBackgroundColor(Color.rgb(35,53,187));
                mBottomPannel.setBackgroundColor(Color.rgb(35,53,187));
                break;
            case R.id.magenta_button:
                mColorText.setText("Magenta");
                mColorText.setTextColor(Color.rgb(167,32,140));
                mTopPannel.setBackgroundColor(Color.rgb(167,32,140));
                mLeftPannel.setBackgroundColor(Color.rgb(167,32,140));
                mRightPannel.setBackgroundColor(Color.rgb(167,32,140));
                mBottomPannel.setBackgroundColor(Color.rgb(167,32,140));
                break;
            case R.id.grey_button:
                mColorText.setText("Grey");
                mColorText.setTextColor(Color.rgb(165,165,165));
                mTopPannel.setBackgroundColor(Color.rgb(165,165,165));
                mLeftPannel.setBackgroundColor(Color.rgb(165,165,165));
                mRightPannel.setBackgroundColor(Color.rgb(165,165,165));
                mBottomPannel.setBackgroundColor(Color.rgb(165,165,165));
                break;
        }
    }
}
