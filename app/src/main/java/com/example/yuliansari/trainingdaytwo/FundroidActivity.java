package com.example.yuliansari.trainingdaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class FundroidActivity extends AppCompatActivity {
    private LinearLayout funbgcolor;
    private ImageView logo;
    private TextView feture;
    private Button button;
    fundroidlist fundroids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundroid);

        logo = (ImageView) findViewById(R.id.logo);
        feture = (TextView) findViewById(R.id.feature);
        //button = (ImageButton) findViewById(R.id.button);
        button = (Button) findViewById(R.id.btn_random);
        funbgcolor = (LinearLayout) findViewById(R.id.activity_fundroid);
        fundroids = new fundroidlist();

        //Log.i(LOG_TAG, "Isi array list ini adalah "+newfundroid);

        final int[] bgcolor = {
                0XFF4DD0E1,
                0XFF64B5F6,
                0XFF7986CB,
                0XFF9575CD,
                0XFFBA68C8,
                0XFFF06292,
                0XFFEF5350,
                0XFFAED581,
                0XFFDCE775
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
               // int randomLogo = randomGenerator.nextInt(droidId.length);
                int randomBG = randomGenerator.nextInt(bgcolor.length);
                int randomNub = randomGenerator.nextInt(fundroids.getSize());
                //Toast.makeText(FundroidActivity.this, "randomNumber : " + randomLogo, Toast.LENGTH_SHORT).show();
                logo.setImageResource(fundroids.getLogo(randomNub));
                funbgcolor.setBackgroundColor(bgcolor[randomBG]);
                feture.setText(fundroids.getFeature(randomNub));
            }
        });
    }
}
