package com.example.recyclerview;

import java.util.ArrayList;

public class BTData {
    public static String[][] data = new String[][]{
            {"Mumbul Arena Futsal, Badminton & Tenis-Meja", "Banjar Mumbul Jl. Taman Giri No.9, Benoa, Kuta, Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipO5KKn3MUoiaid3M1RHZHU2BJ8ndl2V8H0Lvlxy=w160-h160-k-no"},
            {"lapangan Badminton Taman Jimbaran Asri", "Jl. Perum Taman Jimbaran Asri No.5, Jimbaran, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipOT46Td4KtfTYfICkiSCYxZUMBOQMjZERtjPhhX=w120-h160-k-no"},
            {"lapangan badminton ungasan, jimbaran", "Jl. Merak, Ungasan, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipMDLh6L-_plntmMOQBQ7gpqJpw8bGSyLRuFqfni=w213-h160-k-no"},

    };
    public static ArrayList<BT> getListData(){
        ArrayList<BT> list = new ArrayList<>();
        for (String[] aData : data) {
            BT BT = new BT();
            BT.setBTName(aData[0]);
            BT.setBTFrom(aData[1]);
            BT.setBTPhoto(aData[2]);
            list.add(BT);
        }
        return list;
    }
}

