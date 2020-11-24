package com.travel_agency.dto;

import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class DestinationDTO {
    private Long id;
    private String continentName;
    private String countryName;
    private String cityName;
    private String airportName;
    private List<HotelDTO> hotels;
    private List<TripDTO> trips = new ArrayList<>();
}
