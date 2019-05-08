package com.example.futsal;

import java.util.ArrayList;

public class FutsalData {
    public static String[][] data = new String[][]{
            {"Nuansa Futsal", "Jimbaran", "https://bit.ly/2VSPdg0"},
            {"Freedom Futsal", "Jimbaran", "https://bit.ly/2VSPdg0"},
            {"Klub Jimbaran", "Jimbaran", "https://bit.ly/2VSPdg0"},
            {"Jimbaran Futsal", "Jimbaran", "https://bit.ly/2VSPdg0"},
            {"Hattrick Futsal", "Nusa Dua", "https://bit.ly/2VSPdg0"},
            {"Mumbul Arena", "Nusa Dua", "https://bit.ly/2VSPdg0"},
            {"Darmawangsa Futsal", "Nusa Dua", "https://bit.ly/2VSPdg0"},
            {"Arjuna Futsal", "Kuta", "https://bit.ly/2VSPdg0"},
            {"Kuta Futsal", "Kuta", "https://bit.ly/2VSPdg0"},
            {"Wanasegara Futsal", "Kuta", "https://bit.ly/2VSPdg0"},
            {"Central Futsal", "Kuta", "https://bit.ly/2VSPdg0"},
            {"Meazza Futsal", "Denpasar", "https://bit.ly/2VSPdg0"},
            {"Bali Futsal", "Denpasar", "https://bit.ly/2VSPdg0"},
            {"D'Goal Futsal", "Denpasar", "https://bit.ly/2VSPdg0"},
            {"Metro Futsal", "Denpasar", "https://bit.ly/2VSPdg0"}
    };

    public static ArrayList<Futsal> getListData(){
        Futsal futsal = null;
        ArrayList<Futsal> list = new ArrayList<>();
        for (String[] aData : data) {
            futsal = new Futsal();
            futsal.setName(aData[0]);
            futsal.setRemarks(aData[1]);
            futsal.setPhoto(aData[2]);

            list.add(futsal);
        }

        return list;
    }
}
