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
    int randomColor;

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
        final funcolorlist Funcolorlist = new funcolorlist();


        //Log.i(LOG_TAG, "Isi array list ini adalah "+newfundroid);

        //ketika di klik button jadi berubah.
        //kalau mau ketika gambarnya di klik terus berubah, ganti jadi logo.setOnClickListener
        //kalau mau semua layout di klik terus berubah, ganti jadi funbgcolor
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
               // int randomLogo = randomGenerator.nextInt(droidId.length);
                randomColor = Funcolorlist.createFunColor();
                int randomNub = randomGenerator.nextInt(fundroids.getSize());
                //Toast.makeText(FundroidActivity.this, "randomNumber : " + randomLogo, Toast.LENGTH_SHORT).show();
                logo.setImageResource(fundroids.getLogo(randomNub));
                funbgcolor.setBackgroundColor(randomColor);
                feture.setText(fundroids.getFeature(randomNub));
            }
        });
    }
}
