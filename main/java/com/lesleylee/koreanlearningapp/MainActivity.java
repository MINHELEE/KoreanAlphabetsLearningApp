package com.lesleylee.koreanlearningapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static com.lesleylee.koreanlearningapp.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Button btnStudy = (Button) findViewById(R.id.btnStudy);
        btnStudy.setBackgroundColor(Color.RED);
        Button btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setBackgroundColor(Color.BLACK);
        Button btnPractice = (Button) findViewById(R.id.btnPractice);
        btnPractice.setBackgroundColor(Color.BLUE);

        setStudyButton();
        setPracticeButton();
        setAboutButton();
    }

    private void setStudyButton(){

        final Button study = (Button) findViewById(id.btnStudy);
        study.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent goStudy = new Intent(MainActivity.this, StudyActivity.class);
                startActivityForResult(goStudy,1);

            }
        });
    }

    private void setPracticeButton(){

        final Button practice = (Button) findViewById(id.btnPractice);
        practice.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent goPractice = new Intent(MainActivity.this, PracticeActivity.class);
                startActivityForResult(goPractice,1);

            }
        });
    }

    private void setAboutButton(){

        final Button about = (Button) findViewById(id.btnAbout);
        about.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent goAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivityForResult(goAbout,1);

            }
        });
    }
}