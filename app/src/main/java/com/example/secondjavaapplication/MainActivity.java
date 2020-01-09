package com.example.secondjavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int panda = 0;
    private final int chihuahua =  1;
    private final int koala = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pandaButton = findViewById(R.id.pandaButton);
        Button chihuahuaButton = findViewById(R.id.chihuahuaButton);
        Button koalaButton = findViewById(R.id.koalaButton);
        ImageView mainImage = findViewById(R.id.mainImage);


        int randImage = new java.util.Random().nextInt(3);

        switch (randImage) {
            case panda:
                mainImage.setImageResource(R.drawable.panda);
                break;
            case chihuahua:
                mainImage.setImageResource(R.drawable.chihuahua);
                break;
            case koala:
                mainImage.setImageResource(R.drawable.koala);
                break;
        }

        pandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
