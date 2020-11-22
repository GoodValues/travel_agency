package com.travel_agency.model.hotel;

import com.travel_agency.model.city.City;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Hotel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private HotelStandardEnum standard;
    private String description;
    @ManyToOne//joiny itp do dopracowania po zrobieniu klasy CIty
    private City city;

    public Hotel() {
    }

    public Hotel(Long id, String name, HotelStandardEnum standard, String description, City city) {
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.description = description;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelStandardEnum getStandard() {
        return standard;
    }

    public void setStandard(HotelStandardEnum standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) &&
                Objects.equals(name, hotel.name) &&
                standard == hotel.standard &&
                Objects.equals(description, hotel.description) &&
                Objects.equals(city, hotel.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard, description, city);
    }
}
