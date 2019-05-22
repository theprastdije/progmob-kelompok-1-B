package com.example.recyclerview;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
                    {"Bali Futsal", "Jl. Tantular Bar. No.83, Dangin Puri Klod, Kec. Denpasar Tim., Kota Denpasar, Bali 80234", "https://lh5.googleusercontent.com/p/AF1QipNfzsJTnAis6qkm4jW3Ip_Agkfg0s7hXevfQQXB=w284-h160-k-no"},
                    {"Nuansa Futsal Dan Fitness Centre", "Perumahan Kori Nuansa, Jalan Kori Nuansa Barat IV, Jimbaran, Kuta Selatan, Jimbaran, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipMi1PTqTQYXNJRYAUtn4t-8ugucU9EJlaAk8k5C=w213-h160-k-no"},
                    {"FREEDOM FUTSAL ARENA", "Jimbaran, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://fastly.4sqi.net/img/general/600x600/53869456_N7a2mIIVLpSbGSXt_iS-1xI-pUzinIpX4ziGxyTESa8.jpg"},
                    {"Mumbul Arena Futsal, Badminton & Tenis-Meja", "Banjar Mumbul Jl. Taman Giri No.9, Benoa, Kuta, Kabupaten Badung, Bali 80361", "https://scontent-yyz1-1.cdninstagram.com/vp/240fe003029b0dd4d7312c9af7fc4afd/5D972538/t51.2885-15/e35/44310462_2715620545122082_1881636280530569371_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com&se=8"},
                    {"Sawangan Futsal", "Jalan Tukad Bajang, Gang Kusambi, Benoa, Kuta Selatan, Benoa, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://fastly.4sqi.net/img/general/600x600/wY75nipVd31iRipVpsjMLZ4QX0oxTifvtXj4lzYFMVo.jpg"},
                    {"Darmawangsa Futsal", "Jl. Nusa Dua, Benoa, Kec. Kuta Sel., Kabupaten Badung, Bali 80361", "https://lh5.googleusercontent.com/p/AF1QipMw3U3ak4_7w-AAB0yhhGnpU0AGpPpSayrCdQTJ=w213-h160-k-no"},
            };
            public static ArrayList<Hero> getListData(){
                ArrayList<Hero> list = new ArrayList<>();
                for (String[] aData : data) {
                    Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}
