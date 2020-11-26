package com.example.caramella;

public class Myitem {
    private int imgIcon1;
    private int imgIcon2;
    private String dec1;
    private String dec2;

    Myitem(int imgIcon1, int imgIcon2, String dec1, String dec2) {
        this.imgIcon1 = imgIcon1;
        this.imgIcon2 = imgIcon2;
        this.dec1 = dec1;
        this.dec2 = dec2;
    }


    public int getImgIcon1(){return imgIcon1;}
    public void setImageIcon(int imgIcon1){this.imgIcon1=imgIcon1; }
    public int getImgIcon2(){return imgIcon2;}
    public void getImgIcon2(int imgIcon2){this.imgIcon2=imgIcon2;}
    public String getDec1(){return dec1;}
    public void setDec1(String dec1){this.dec1=dec1;}
    public String getDec2(){return dec2;}
    public void setDec2(String dec2){this.dec2=dec2;}



    public String toString() {
        return getDec1();
    }

}


