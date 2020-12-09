package com.travel_agency.repository;

import com.travel_agency.model.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TripRepository extends JpaRepository<Trip, Long> {

}
