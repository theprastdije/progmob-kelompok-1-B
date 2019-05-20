package com.example.recyclerview;

import java.util.ArrayList;

public class TenisData {
    public static String[][] data = new String[][]{
            {"Tenis", "Tenis desc", "https://upload.wikimedia.org/wikipedia/id/e/e0/Iron_Man_bleeding_edge.jpg"},
    };
    public static ArrayList<Tenis> getListData(){
        ArrayList<Tenis> list = new ArrayList<>();
        for (String[] aData : data) {
            Tenis Tenis = new Tenis();
            Tenis.setTenisName(aData[0]);
            Tenis.setTenisFrom(aData[1]);
            Tenis.setTenisPhoto(aData[2]);
            list.add(Tenis);
        }
        return list;
    }
}
