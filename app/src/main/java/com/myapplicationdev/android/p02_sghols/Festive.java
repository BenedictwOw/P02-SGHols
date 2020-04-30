package com.myapplicationdev.android.p02_sghols;

public class Festive {
    private String festivename;
    private String date;
    private Integer image;


    public Festive(String festivename, String date, int image) {
        this.festivename = festivename;
        this.date = date;
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getFestivename() {
        return festivename;
    }

    public void setFestivename(String festivename) {
        this.festivename = festivename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Festive{" +
                "festivename='" + festivename + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
