package com.travel_agency.service;

import com.travel_agency.dto.TripDTO;
import com.travel_agency.mapper.TripMapper;
import com.travel_agency.model.trip.Trip;
import com.travel_agency.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {

    TripRepository tripRepository;

    public List<TripDTO> getAllTrips() {
        List<Trip> trips = tripRepository.findAll();
        List<TripDTO> result = new ArrayList<>();
        for (Trip trip : trips)
            result.add(TripMapper.INSTANCE.tripToDto(trip));
        return result;
    }
}
