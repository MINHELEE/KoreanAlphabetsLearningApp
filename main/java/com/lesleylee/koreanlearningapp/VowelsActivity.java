package com.lesleylee.koreanlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VowelsActivity extends AppCompatActivity {
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowels);

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

            // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
            // and the array that contains the data
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

            // Here, you set the data in your ListView
            list.setAdapter(adapter);
    }
}