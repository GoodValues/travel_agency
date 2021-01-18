package com.travel_agency.weather_checker;

import java.io.Serializable;

public class Temp implements Serializable {
    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
