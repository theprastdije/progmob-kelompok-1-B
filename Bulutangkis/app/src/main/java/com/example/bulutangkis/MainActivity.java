package com.example.bulutangkis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Bulutangkis> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(BulutangkisData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBulutangkisAdapter listBulutangkisAdapter = new ListBulutangkisAdapter(this);
        listBulutangkisAdapter.setListBulutangkis(list);
        rvCategory.setAdapter(listBulutangkisAdapter);
    }
}
