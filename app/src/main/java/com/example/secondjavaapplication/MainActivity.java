package com.example.secondjavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int panda = 0;
    private final int chihuahua = 1;
    private final int koala = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] buttons = new Button[3];
        Button pandaButton = findViewById(R.id.pandaButton);
        Button chihuahuaButton = findViewById(R.id.chihuahuaButton);
        Button koalaButton = findViewById(R.id.koalaButton);
//        buttons[0] = pandaButton;
        buttons[1] = chihuahuaButton;
        buttons[2] = koalaButton;
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

        View.OnClickListener pandaButtonClicked = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        };

        pandaButton.setOnClickListener(pandaButtonClicked);

    }
}
