package com.example.recyclerview;

import java.util.ArrayList;

public class BTData {
    public static String[][] data = new String[][]{
            {"BT", "BT desc", "https://upload.wikimedia.org/wikipedia/id/e/e0/Iron_Man_bleeding_edge.jpg"},
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

