package com.travel_agency.weather_checker;

import java.io.Serializable;
import java.util.List;

public class Listo implements Serializable {

    private List<Temp> temp;
    private String pressure;
    private String humidity;
    private List<Weather> weather;

}
