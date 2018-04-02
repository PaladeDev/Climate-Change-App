package com.eftenoiuclaudiu.climatechange;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EffectsActivity extends AppCompatActivity {


    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.effects_activity);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.effectsLayout);
    }
}
