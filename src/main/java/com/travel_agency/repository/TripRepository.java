package com.travel_agency.repository;

import com.travel_agency.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {
}
