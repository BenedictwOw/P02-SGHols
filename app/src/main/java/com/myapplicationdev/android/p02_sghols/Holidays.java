package com.myapplicationdev.android.p02_sghols;

public class Holidays {
    private String name;
    private boolean isHoliday;
    public Holidays(String name, boolean isHoliday) {
        this.name = name;
        this.isHoliday = isHoliday;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public void setHoliday(boolean holiday) {
        isHoliday = holiday;
    }

    public String getName() {
        return name;
    }
}
