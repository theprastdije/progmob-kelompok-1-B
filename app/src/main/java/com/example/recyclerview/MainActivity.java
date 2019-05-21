package com.example.recyclerview;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }
    private RecyclerView rvCategory;
    private ArrayList<Hero> list = new ArrayList<>();
    private ArrayList<Basket> listbasket = new ArrayList<>();
    private ArrayList<BT> listBT = new ArrayList<>();
    private ArrayList<Tenis> listTenis = new ArrayList<>();
    private static final String TAG = "mainActivity";
    private String title = "Futsal";
    private void showSelectedHero(Hero Hero){
        Toast.makeText(this, "Kamu memilih "+Hero.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setActionBarTitle("Futsal");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();

        listbasket.addAll(BasketData.getListData());
        showRecyclerList();

        listBT.addAll(BTData.getListData());
        showRecyclerList();

        listTenis.addAll(TenisData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(this);
        listHeroAdapter.setListHero(list);
        rvCategory.setAdapter(listHeroAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",HeroesData.getListData().get(position).getName());
                intent.putExtra("chardesc",HeroesData.getListData().get(position).getFrom());
                intent.putExtra("imgchar",HeroesData.getListData().get(position).getPhoto());
                startActivity(intent);
            }
        });
    }

    private void showRecyclerListBasket(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBasketAdapter listBasketAdapter = new ListBasketAdapter(this);
        listBasketAdapter.setListBasket(listbasket);
        rvCategory.setAdapter(listBasketAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",BasketData.getListData().get(position).getbasketName());
                intent.putExtra("chardesc",BasketData.getListData().get(position).getBasketFrom());
                intent.putExtra("imgchar",BasketData.getListData().get(position).getBasketPhoto());
                startActivity(intent);
            }
        });
    }

    private void showRecyclerListBT(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBTAdapter listBTAdapter = new ListBTAdapter(this);
        listBTAdapter.setListBT(listBT);
        rvCategory.setAdapter(listBTAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",BTData.getListData().get(position).getBTName());
                intent.putExtra("chardesc",BTData.getListData().get(position).getBTFrom());
                intent.putExtra("imgchar",BTData.getListData().get(position).getBTPhoto());
                startActivity(intent);
            }
        });
    }

    private void showRecyclerListTenis(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListTenisAdapter listTenisAdapter = new ListTenisAdapter(this);
        listTenisAdapter.setListTenis(listTenis);
        rvCategory.setAdapter(listTenisAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",TenisData.getListData().get(position).getTenisName());
                intent.putExtra("chardesc",TenisData.getListData().get(position).getTenisFrom());
                intent.putExtra("imgchar",TenisData.getListData().get(position).getTenisPhoto());
                startActivity(intent);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                setActionBarTitle("Futsal");
                showRecyclerList();
                break;
            case R.id.action_listbasket:
                setActionBarTitle("Basket");
                showRecyclerListBasket();
                break;
            case R.id.action_listBT:
                setActionBarTitle("Bulu Tangkis");
                showRecyclerListBT();
                break;
            case R.id.action_listTenis:
                setActionBarTitle("Tenis");
                showRecyclerListTenis();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

