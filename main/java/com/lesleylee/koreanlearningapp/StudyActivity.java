package com.lesleylee.koreanlearningapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        Button btnconsonants = (Button) findViewById(R.id.btnConsonant);
        btnconsonants.setBackgroundColor(Color.RED);

        Button btnvowels = (Button) findViewById(R.id.btnVowel);
        btnvowels.setBackgroundColor(Color.BLUE);

        setConsonantsButton();
        setVowelsButton();
    }

    private void setConsonantsButton(){

        final Button btnconsonants = (Button) findViewById(R.id.btnConsonant);
        btnconsonants.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent goConsonant = new Intent(StudyActivity.this, ConsonantsActivity.class);
                startActivityForResult(goConsonant,1);

            }
        });
    }


    private void setVowelsButton(){

        final Button btnvowels = (Button) findViewById(R.id.btnVowel);
        btnvowels.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent goVowel = new Intent(StudyActivity.this, VowelsActivity.class);
                startActivityForResult(goVowel,1);

            }
        });
    }

}