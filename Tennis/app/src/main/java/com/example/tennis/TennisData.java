package com.example.tennis;

import java.util.ArrayList;

public class TennisData {
    public static String[][] data = new String[][]{
            {"Lapangan Tenis Saraswati", "Nusa DUa", "https://bit.ly/2cizg87"},
            {"Bali Clay Court", "Kerobokan", "https://bit.ly/2cizg87"},
            {"Lapanagan UNUD Sudirman", "Denpasar", "https://bit.ly/2cizg87"},
            {"Lapangan UNUD Bukit", "Jimbaran", "https://bit.ly/2cizg87"},
            {"Lapangan Tenis Koni", "Denpasar", "https://bit.ly/2cizg87"},
            {"Lapangan Tenis Samudera", "Kuta", "https://bit.ly/2cizg87"},
    };

    public static ArrayList<Tennis> getListData(){
        Tennis tennis = null;
        ArrayList<Tennis> list = new ArrayList<>();
        for (String[] aData : data) {
            tennis = new Tennis();
            tennis.setName(aData[0]);
            tennis.setRemarks(aData[1]);
            tennis.setPhoto(aData[2]);

            list.add(tennis);
        }
        return list;
    }
}

