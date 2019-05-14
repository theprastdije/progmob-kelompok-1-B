package com.example.bulutangkis;

import java.util.ArrayList;

public class BulutangkisData {
    public static String[][] data = new String[][]{
            {"Banjar Taman Griya", "Jimbaran", "https://bit.ly/2LVxKjx"},
            {"Mumbul Arena", "Nusa Dua", "https://bit.ly/2LVxKjx"},
            {"Lapangan Ungasan", "Jimbaran", "https://bit.ly/2LVxKjx"},
            {"Lapangan Sidharta", "Kuta", ""},
            {"Bultang Poh Gading", "Jimbaran", "https://bit.ly/2LVxKjx"},
            {"Gelogor Carik", "Denpasar", "https://bit.ly/2LVxKjx"},
            {"Dewa Bharata Sport", "Denpasar", "https://bit.ly/2LVxKjx"}
    };

    public static ArrayList<Bulutangkis> getListData() {
        Bulutangkis bulutangkis = null;
        ArrayList<Bulutangkis> list = new ArrayList<>();
        for (String[] aData : data) {
            bulutangkis = new Bulutangkis();
            bulutangkis.setName(aData[0]);
            bulutangkis.setRemarks(aData[1]);
            bulutangkis.setPhoto(aData[2]);

            list.add(bulutangkis);
        }
        return list;
    }
}