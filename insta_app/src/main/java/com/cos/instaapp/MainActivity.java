package com.cos.instaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> dataList;
    private MainAdapter adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private String TAG = "태그";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
//        linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//        dataList= new ArrayList<>();
//        adapter=new MainAdapter(dataList);  // 데이터를 어뎁터에
//        recyclerView.setAdapter(adapter);      // 어뎁터를 리사이클뷰에

        
//        for (int i =0; i<10;i++){
//            Data data=new Data(R.drawable.img2,"김동탁","댓글");
//            dataList.add(data);
//            adapter.notifyDataSetChanged();
//
//        }

    }

}