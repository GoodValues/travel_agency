package com.travel_agency.weather_checker;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataService {


    private static final String WEATHER_URI = "api.openweathermap.org/data/2.5/forecast/daily?";

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public Weather getDataByCityId(String cityId) {
        String uri = WEATHER_URI + "q=" + cityId;
        return this.getWeatherResponse(uri);
    }

    public Weather getDataByCityName(String cityName, String numberOfDaysForecast) {
        String uri = WEATHER_URI + "q=" + cityName + "&cnt=" + numberOfDaysForecast + "&appid=" + apiKey ;
        return this.getWeatherResponse(uri);
    }


    private Weather getWeatherResponse(String uri) {
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Weather resp = null;
        String strBody = null;
        if (respString.getStatusCodeValue() == 200) {
            strBody = respString.getBody();
        }
        try {
            resp = objectMapper.readValue(strBody, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;

    }
}
