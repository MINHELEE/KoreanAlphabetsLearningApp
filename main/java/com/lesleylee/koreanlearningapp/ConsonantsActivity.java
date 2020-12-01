package com.lesleylee.koreanlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ConsonantsActivity extends AppCompatActivity {
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonants);

        list = (ListView) findViewById(R.id.character_list_consonants);
        arrayList = new ArrayList<String>();
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

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);
    }
}