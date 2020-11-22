package com.travel_agency.model.trip;

import com.travel_agency.model.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private Duration duration;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private TripTypeEnum tripType;
    private String description;
    private String pictureUrl;
    private TripStatusEnum status;
    private Integer peopleLimit;
    @ManyToMany// joinColumns, fetching, kaskady po zrobieniu User
    private List<User> users = new ArrayList<>();

    public Trip() {
    }

    public Trip(Long id, LocalDateTime dateFrom, LocalDateTime dateTo, Duration duration,
                BigDecimal priceForAdult, BigDecimal priceForChild, TripTypeEnum tripType,
                String description, String pictureUrl, TripStatusEnum status, Integer peopleLimit, List<User> users) {
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.duration = duration;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.tripType = tripType;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.status = status;
        this.peopleLimit = peopleLimit;
        this.users = users;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(id, trip.id) &&
                Objects.equals(dateFrom, trip.dateFrom) &&
                Objects.equals(dateTo, trip.dateTo) &&
                Objects.equals(duration, trip.duration) &&
                Objects.equals(priceForAdult, trip.priceForAdult) &&
                Objects.equals(priceForChild, trip.priceForChild) &&
                tripType == trip.tripType &&
                Objects.equals(description, trip.description) &&
                Objects.equals(pictureUrl, trip.pictureUrl) &&
                status == trip.status &&
                Objects.equals(peopleLimit, trip.peopleLimit) &&
                Objects.equals(users, trip.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateFrom, dateTo, duration, priceForAdult, priceForChild, tripType, description, pictureUrl, status, peopleLimit, users);
    }
}
