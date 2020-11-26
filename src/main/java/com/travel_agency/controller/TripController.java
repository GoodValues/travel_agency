package com.travel_agency.controller;

import com.travel_agency.dto.TripDTO;
import com.travel_agency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class TripController {

    TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @ResponseBody
    @GetMapping("/trips")
    public List<TripDTO> getAllTrips(Model model) {
//        List<TripDTO> trips = tripService.getAllTrips();
//        model.addAttribute("tripsList", trips);
//        return "trips";
        return tripService.getAllTrips();
    }

    @ResponseBody
    @GetMapping(value = "/trips/{id}", produces = "application/json")
    TripDTO getTripById(@PathVariable("id") Long id) {
        return tripService.getTripById(id);
    }

    @ResponseBody
    @GetMapping(value = "/tripname/{id}", produces = "application/json")
    String getTripNameById(@PathVariable("id") Long id) {
        TripDTO tripDTO = tripService.getTripById(id);
        String tripName = tripDTO.getDescription();
        return tripName;
    }
}
