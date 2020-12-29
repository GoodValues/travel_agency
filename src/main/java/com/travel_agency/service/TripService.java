package com.travel_agency.service;

import com.travel_agency.dto.TripDTO;
import com.travel_agency.mapper.TripMapper;
import com.travel_agency.model.trip.Trip;
import com.travel_agency.repository.TripRepository;
import com.travel_agency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    TripRepository tripRepository;
    UserRepository userRepository;

    @Autowired
    public TripService(TripRepository tripRepository, UserRepository userRepository) {
        this.tripRepository = tripRepository;
        this.userRepository = userRepository;
    }

    public List<TripDTO> getAllTrips() {
        List<Trip> trips = tripRepository.findAll();
        List<TripDTO> result = new ArrayList<>();
        for (Trip trip : trips)
            result.add(TripMapper.INSTANCE.tripToDto(trip));
        return result;
    }

    public TripDTO getTripById(Long id) {
        Optional<Trip> trip = tripRepository.findById(id);

        BigDecimal tripPriceAdult = trip.orElseThrow(() -> new NullPointerException("No trip with such id")).getPriceForAdult();

        return trip.map(TripMapper.INSTANCE::tripToDto).orElse(null);
    }

    public List<TripDTO> getTripsForUser(Long userId) {
        List<Trip> trips = userRepository.findById(userId).orElseThrow(() -> new NullPointerException("There is no trips for user with given id")).getTrips();
        List<TripDTO> result = new ArrayList<>();
        for (Trip trip : trips)
            result.add(TripMapper.INSTANCE.tripToDto(trip));
        return result;
    }
}
