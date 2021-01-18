package com.travel_agency.weather_checker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;


    @GetMapping(value = "/cityId")
    public Weather getWeatherByCityId(@RequestParam("cityId") String cityId){
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping(value = "/cityName")
    public Weather getWeatherByCityName(@RequestParam("q") String cityName, @RequestParam("cnt") String numberOfDaysForecast){
        return weatherDataService.getDataByCityName(cityName, numberOfDaysForecast);
    }

}
