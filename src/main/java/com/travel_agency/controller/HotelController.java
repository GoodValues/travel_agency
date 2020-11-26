package com.travel_agency.controller;

import com.travel_agency.dto.HotelDTO;
import com.travel_agency.dto.TripDTO;
import com.travel_agency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class HotelController {

    HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @ResponseBody
    @RequestMapping(value = "/hotels", produces="application/json")
    public List<HotelDTO> getAllHotels() {
        return hotelService.getAllHotels();
    }
}
