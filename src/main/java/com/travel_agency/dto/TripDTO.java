package com.travel_agency.dto;

import com.travel_agency.model.destination.Destination;
import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.TripAlimentationEnum;
import com.travel_agency.model.trip.TripStatusEnum;
import com.travel_agency.model.trip.TripTypeEnum;
import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class TripDTO {

    public TripDTO(Long id, LocalDateTime dateFrom, LocalDateTime dateTo, Duration duration, BigDecimal priceForAdult, BigDecimal priceForChild, TripTypeEnum tripType, TripAlimentationEnum tripAlimentationEnum, String description, TripStatusEnum status, Integer peopleLimit, Destination destination, List<User> users, List<Hotel> hotels) {
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.duration = duration;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.tripType = tripType;
        this.tripAlimentationEnum = tripAlimentationEnum;
        this.description = description;
        this.status = status;
        this.peopleLimit = peopleLimit;
        this.destination = destination;
        this.users = users;
        this.hotels = hotels;
    }

    public TripDTO() {
    }

    private Long id;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private Duration duration;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private TripTypeEnum tripType;
    private TripAlimentationEnum tripAlimentationEnum;
    private String description;

    private TripStatusEnum status;

    private Integer peopleLimit;

    private Destination destination;

    private List<User> users = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public BigDecimal getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(BigDecimal priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public BigDecimal getPriceForChild() {
        return priceForChild;
    }

    public void setPriceForChild(BigDecimal priceForChild) {
        this.priceForChild = priceForChild;
    }

    public TripTypeEnum getTripType() {
        return tripType;
    }

    public void setTripType(TripTypeEnum tripType) {
        this.tripType = tripType;
    }

    public TripAlimentationEnum getTripAlimentationEnum() {
        return tripAlimentationEnum;
    }

    public void setTripAlimentationEnum(TripAlimentationEnum tripAlimentationEnum) {
        this.tripAlimentationEnum = tripAlimentationEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TripStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TripStatusEnum status) {
        this.status = status;
    }

    public Integer getPeopleLimit() {
        return peopleLimit;
    }

    public void setPeopleLimit(Integer peopleLimit) {
        this.peopleLimit = peopleLimit;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
