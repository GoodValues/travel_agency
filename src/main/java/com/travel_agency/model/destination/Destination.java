package com.travel_agency.model.destination;

import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Destination {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    private String continentName;
    private String airportName;
    @OneToMany//do dopracowania
    private List<Hotel> hotels;
    @ManyToMany//do dopracowania
    private List<Trip> trips = new ArrayList<>();

    public Destination() {
    }

    public Destination(Long id, String countryName, String continentName, String airportName, List<Hotel> hotels, List<Trip> trips) {
        this.id = id;
        this.countryName = countryName;
        this.continentName = continentName;
        this.airportName = airportName;
        this.hotels = hotels;
        this.trips = trips;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(continentName, that.continentName) &&
                Objects.equals(airportName, that.airportName) &&
                Objects.equals(hotels, that.hotels) &&
                Objects.equals(trips, that.trips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryName, continentName, airportName, hotels, trips);
    }
}
