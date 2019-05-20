package com.example.recyclerview;

public class Basket {
    public String getbasketName() {
        return basketname;
    }

    public void setBasketName(String basketname) {
        this.basketname = basketname;
    }

    public String getBasketFrom() {
        return basketfrom;
    }

    public void setBasketFrom(String basketFrom) {
        this.basketfrom = basketFrom;
    }

    public String getBasketPhoto() {
        return basketphoto;
    }

    public void setBasketPhoto(String basketphoto) {
        this.basketphoto = basketphoto;
    }

    private String basketname, basketfrom, basketphoto;
}
