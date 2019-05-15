package com.example.menudashboardsportshub;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(BasketData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        AlertDialog.Builder rvCategory;
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBasketAdapter listBasketAdapter = new ListBasketAdapter(this);
        listBasketAdapter.setListBasket(list);
        rvCategory.setAdapter(listBasketAdapter);
    }
}
