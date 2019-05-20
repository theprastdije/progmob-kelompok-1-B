package com.example.recyclerview;

import java.util.ArrayList;

public class BasketData {
    public static String[][] data = new String[][]{
            {"Basket", "Basket desc", "https://upload.wikimedia.org/wikipedia/id/e/e0/Iron_Man_bleeding_edge.jpg"},
    };
    public static ArrayList<Basket> getListData(){
        ArrayList<Basket> list = new ArrayList<>();
        for (String[] aData : data) {
            Basket Basket = new Basket();
            Basket.setBasketName(aData[0]);
            Basket.setBasketFrom(aData[1]);
            Basket.setBasketPhoto(aData[2]);
            list.add(Basket);
        }
        return list;
    }
}
