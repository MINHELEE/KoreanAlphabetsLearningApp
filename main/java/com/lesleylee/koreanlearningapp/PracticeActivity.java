package com.lesleylee.koreanlearningapp;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PracticeActivity extends AppCompatActivity {
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private int count = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        generateQuestion();

        Button o1 = (Button)findViewById(R.id.quiz2_first_option);
        Button o2 = (Button)findViewById(R.id.quiz2_second_option);
        Button o3 = (Button)findViewById(R.id.quiz2_third_option);
        Button o4 = (Button)findViewById(R.id.quiz2_fourth_option);

        o1.setOnClickListener(this::onClick);
        o2.setOnClickListener(this::onClick);
        o3.setOnClickListener(this::onClick);
        o4.setOnClickListener(this::onClick);
    }

    public void generateQuestion() {
        if(count < 10) {
            count++;
            list = (ListView) findViewById(R.id.character_list_vowels);
            arrayList = new ArrayList<String>();
            arrayList.add("     ㅏ                                                               a");
            arrayList.add("     ㅓ                                                               eo");
            arrayList.add("     ㅗ                                                               no");
            arrayList.add("     ㅜ                                                               u");
            arrayList.add("     ㅡ                                                               eu");
            arrayList.add("     ㅣ                                                               i");
            arrayList.add("     ㅑ                                                               ya");
            arrayList.add("     ㅕ                                                               yeo");
            arrayList.add("     ㅛ                                                               yo");
            arrayList.add("     ㅠ                                                               yu");
            arrayList.add("     ㅐ                                                               ae");
            arrayList.add("     ㅔ                                                               e");
            arrayList.add("     ㅒ                                                               yae");
            arrayList.add("     ㅖ                                                               ye");
            arrayList.add("     ㅢ                                                               ui");
            arrayList.add("     ㅚ                                                               oe");
            arrayList.add("     ㅘ                                                               wa");
            arrayList.add("     ㅙ                                                               wae");
            arrayList.add("     ㅞ                                                               we");
            arrayList.add("     ㅝ                                                               wo");
            arrayList.add("     ㅟ                                                               wi");
            arrayList.add("     ㄱ                                                               g");
            arrayList.add("     ㅋ                                                               k");
            arrayList.add("     ㄴ                                                               n");
            arrayList.add("     ㄷ                                                               d");
            arrayList.add("     ㅌ                                                               t");
            arrayList.add("     ㅁ                                                               m");
            arrayList.add("     ㅂ                                                               b");
            arrayList.add("     ㅍ                                                               p");
            arrayList.add("     ㄹ                                                               l");
            arrayList.add("     ㅅ                                                               s");
            arrayList.add("     ㅈ                                                               j");
            arrayList.add("     ㅊ                                                               ch");
            arrayList.add("     ㅎ                                                               h");
            arrayList.add("     ㅇ                                                               ng");
            arrayList.add("     ㄲ                                                               kk");
            arrayList.add("     ㄸ                                                               tt");
            arrayList.add("     ㅃ                                                               bb");
            arrayList.add("     ㅆ                                                               ss");
            arrayList.add("     ㅉ                                                               jj");

            Map<String, String> wordsMap = new ArrayMap<String, String>();
            for (int i = 0; i < arrayList.size(); i++) {
                String temp = arrayList.get(i);
                String key = temp.substring(5, 6);
                String val = temp.substring(69);
                Log.d("Debug: ", key + " : " + val);
                wordsMap.put(key, val);
            }

            Random random = new Random();
            List<String> keys = new ArrayList<String>(wordsMap.keySet());
            String answerKey = keys.get(random.nextInt(keys.size()));
            String answerValue = wordsMap.get(answerKey);

            TextView question = (TextView) findViewById(R.id.question);
            question.setText(answerKey);

            TextView invisibleVal = (TextView) findViewById(R.id.invisibleVal);
            invisibleVal.setText(answerValue);

            int n = random.nextInt(3);
            Button o1 = (Button) findViewById(R.id.quiz2_first_option);
            Button o2 = (Button) findViewById(R.id.quiz2_second_option);
            Button o3 = (Button) findViewById(R.id.quiz2_third_option);
            Button o4 = (Button) findViewById(R.id.quiz2_fourth_option);
            if (n == 0) {
                o1.setText(answerValue);
            } else if (n == 1) {
                o2.setText(answerValue);
            } else if (n == 2) {
                o3.setText(answerValue);
            } else {
                o4.setText(answerValue);
            }

            String opVal1;
            String opVal2;
            String opVal3;

            List<String> values = new ArrayList<String>(wordsMap.values());
            for (int i = 0; i < 3; i++) {
                if (n == 0) {
                    opVal1 = values.get(random.nextInt(values.size()));
                    o2.setText(opVal1);
                    opVal2 = values.get(random.nextInt(values.size()));
                    o3.setText(opVal2);
                    opVal3 = values.get(random.nextInt(values.size()));
                    o4.setText(opVal3);
                }

                if (n == 1) {
                    opVal1 = values.get(random.nextInt(values.size()));
                    o1.setText(opVal1);
                    opVal2 = values.get(random.nextInt(values.size()));
                    o3.setText(opVal2);
                    opVal3 = values.get(random.nextInt(values.size()));
                    o4.setText(opVal3);
                }

                if (n == 2) {
                    opVal1 = values.get(random.nextInt(values.size()));
                    o1.setText(opVal1);
                    opVal2 = values.get(random.nextInt(values.size()));
                    o2.setText(opVal2);
                    opVal3 = values.get(random.nextInt(values.size()));
                    o4.setText(opVal3);
                }

                if (n == 3) {
                    opVal1 = values.get(random.nextInt(values.size()));
                    o1.setText(opVal1);
                    opVal2 = values.get(random.nextInt(values.size()));
                    o2.setText(opVal2);
                    opVal3 = values.get(random.nextInt(values.size()));
                    o3.setText(opVal3);
                }
            }
        } else {
            Toast.makeText(this, "Game Over! Score:" + score, Toast.LENGTH_SHORT).show();

        }
    }

    public void onClick(View v){
        TextView invisibleVal = (TextView)findViewById(R.id.invisibleVal);
        Button o1 = (Button)findViewById(R.id.quiz2_first_option);
        Button o2 = (Button)findViewById(R.id.quiz2_second_option);
        Button o3 = (Button)findViewById(R.id.quiz2_third_option);
        Button o4 = (Button)findViewById(R.id.quiz2_fourth_option);
        RelativeLayout result = (RelativeLayout) findViewById(R.id.layout_quiz2_result);
        TextView result_text = (TextView) findViewById(R.id.quiz2_result_text);

        String o1Text = (String) o1.getText();
        String o2Text = (String) o2.getText();
        String o3Text = (String) o3.getText();
        String o4Text = (String) o4.getText();

        String vText = (String) invisibleVal.getText();

        if(v.getId() ==  R.id.quiz2_first_option) {
            if(o1Text.equals(vText)) {
                result.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
                result_text.setText("Correct :)");
                score++;
            } else {
                result.setBackgroundColor(ContextCompat.getColor(this,R.color.red));
                result_text.setText("Incorrect :(");
            }
            generateQuestion();
        } else if (v.getId() ==  R.id.quiz2_second_option) {
            if(o2Text.equals(vText)) {
                result.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
                result_text.setText("Correct :)");
                score++;
            } else {
                result.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                result_text.setText("Incorrect :(");
            }
            generateQuestion();
        } else if (v.getId() ==  R.id.quiz2_third_option) {
            if(o3Text.equals(vText)) {
                result.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
                result_text.setText("Correct :)");
                score++;
            } else {
                result.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                result_text.setText("Incorrect :(");
            }
            generateQuestion();
        } else if (v.getId() ==  R.id.quiz2_fourth_option) {
            if(o4Text.equals(vText)) {
                result.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
                result_text.setText("Correct :)");
                score++;
            } else {
                result.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                result_text.setText("Incorrect :(");
            }
            generateQuestion();
        }
    }

}