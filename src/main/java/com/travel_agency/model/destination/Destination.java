package com.travel_agency.model.destination;

import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Table(name = "destination")
public class Destination {

    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    @Column(name="continent")
    private String continentName;
    @NotEmpty
    @Column(nullable = false, name = "country")
    private String countryName;
    @NotEmpty
    @Column(nullable = false, name = "city")
    private String cityName;
    @NotEmpty
    @Column(name = "airport")
    private String airportName;
    @OneToMany(mappedBy = "destination",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Hotel> hotels= new ArrayList<>();
    @OneToMany(mappedBy = "destination", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Trip> trips = new ArrayList<>();


}
