package com.travel_agency.repository;

import com.travel_agency.model.destination.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

    Optional<List<Destination>> findAllByContinent(String continent);
}
