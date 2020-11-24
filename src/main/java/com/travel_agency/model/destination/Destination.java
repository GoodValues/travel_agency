package com.travel_agency.model.destination;

import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Destination {

    @Id
    @GeneratedValue
    private Long id;
    private String continentName;
    private String countryName;
    private String cityName;
    private String airportName;
    @OneToMany//do dopracowania
    private List<Hotel> hotels;
    @ManyToMany//do dopracowania
    private List<Trip> trips = new ArrayList<>();


}
