package com.example.recyclerview;

import java.util.ArrayList;

public class TenisData {
    public static String[][] data = new String[][]{
            {"Lapangan Tenis Lumintang", "Dauh Puri Kaja, Kec. Denpasar Utara, Kota Denpasar, Bali 80231", "https://lh5.googleusercontent.com/p/AF1QipMltYI6qkgdY2bgmY1J9eSeC1uBLNHddOzpm8RM=w213-h160-k-no"},
            {"Bali Clay Court Tennis", "Jl. Cendrawasih No No.25XX, Kerobokan Kelod, North Kuta, Badung Regency, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipMlD1UhJsye0W6zsFEha0AHUOlSOMFEYnH1goVO=w284-h160-k-no"},
            {"Lapangan tenis PLN", "Panjer, Kec. Denpasar Sel., Kota Denpasar, Bali 80239", "https://lh5.googleusercontent.com/p/AF1QipOtz_BzsuBaXRCp7NVOm922On-P1bgJZuYJbIzo=w78-h160-k-no"},
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
