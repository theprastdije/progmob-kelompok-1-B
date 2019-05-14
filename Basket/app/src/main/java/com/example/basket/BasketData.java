package com.example.basket;

import java.util.ArrayList;

public class BasketData {
    public static String[][] data = new String[][]{
            {"KJ", "Jimbaran", "https://bit.ly/2LFbEBu"},
            {"Lapangan PNB", "Jimbaran", "https://bit.ly/2LFbEBu"},
            {"Lapangan Basket Central", "Denpasar", "https://bit.ly/2LFbEBu"},
            {"Lapangan Basket Denpasar", "Denpasar", "https://bit.ly/2LFbEBu"},
            {"Lapangan SMPN 3 Kuta Selatan", "Nusa Dua", "https://bit.ly/2LFbEBu"},
            {"Lapangan SMKN 1 Kuta Selatan", "Nusa DUa", "https://bit.ly/2LFbEBu"}
    };

    public static ArrayList<Basket> getListData() {
        Basket basket = null;
        ArrayList<Basket> list = new ArrayList<>();
        for (String[] aData : data) {
            basket = new Basket();
            basket.setName(aData[0]);
            basket.setRemarks(aData[1]);
            basket.setPhoto(aData[2]);

            list.add(basket);
        }
        return list;
    }
}