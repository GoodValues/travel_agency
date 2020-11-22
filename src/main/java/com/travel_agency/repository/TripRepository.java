package com.travel_agency.repository;

import com.travel_agency.model.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {
}
