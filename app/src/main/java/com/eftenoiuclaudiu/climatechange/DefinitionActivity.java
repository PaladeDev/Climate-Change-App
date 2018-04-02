package com.eftenoiuclaudiu.climatechange;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DefinitionActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definition_activity);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.definitionLayout);
    }

}
