package com.example.recyclerview;

import java.util.ArrayList;

public class BasketData {
    public static String[][] data = new String[][]{
            {"Central Futsal dan LAPANGAN BASKET", " Jl. Glogor Carik, Pemogan, Kec. Denpasar Sel., Kota Denpasar, Bali 80361", "https://lapanganfutsal.id/wp-content/uploads/2018/10/logo-central-futsal-bali.jpg"},
            {"GOR Merpati", "Jl. Cargo, Ubung Kaja, Kec. Denpasar Utara, Kota Denpasar, Bali 80116", "https://lh5.googleusercontent.com/p/AF1QipMnl76BF61Kq-Gv2Ypnolrg5jQuDbB-SUt_vJTz=w213-h160-k-no"},
            {"Lapangan Basket Gunung Rinjani", "Jl. Gunung Rinjani, Tegal Harum, Kec. Denpasar Bar., Kota Denpasar, Bali 80112", "https://lh5.googleusercontent.com/p/AF1QipPV1tIFD9Wab4YUOlbYq5HNLMQ8OzP3Fka6mPJf=w118-h160-k-no"},
            {"Lapangan Basket Tegal Jaya", "Dalung, Kec. Kuta Utara, Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipNX0B5xwI6TysC7_8p1_nJQMwYimUOEv4P1j48x=w90-h160-k-no"},
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
