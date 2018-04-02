package com.eftenoiuclaudiu.climatechange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView definitionImage;
    private ImageView causesImage;
    private ImageView effectsImage;
    private ImageView solutionImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        definitionImage = (ImageView) findViewById(R.id.definitionImageView);
        causesImage = (ImageView) findViewById(R.id.causesImageView);
        effectsImage = (ImageView) findViewById(R.id.effectsImageView);
        solutionImage = (ImageView) findViewById(R.id.solutionImageView);

        definitionImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DefinitionActivity.class);
                startActivity(myIntent);
            }
        });

        causesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CausesActivity.class);
                startActivity(myIntent);
            }
        });

        effectsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, EffectsActivity.class);
                startActivity(myIntent);
            }
        });

        solutionImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SolutionsActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
