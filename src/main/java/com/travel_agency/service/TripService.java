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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TripService {

    TripRepository tripRepository;
    UserRepository userRepository;
    private Map<Long, Integer> map = new HashMap<>();

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

        setCounterValue(id);
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

    private final String lock = new String("id");

    public void setCounterValue(Long id) {
        synchronized (lock) {
            System.out.println("locking on :" + lock);
            tripRepository.findById(id).ifPresent(trip -> {
                incrementCounter(trip);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                putInMap(trip);
            });
        }
    }

    private void incrementCounter(Trip trip) {
        trip.setCounter(trip.getCounter() + 1);
        tripRepository.save(trip);
    }

    private void putInMap(Trip trip) {
        map.put(trip.getId(), trip.getCounter());
    }

    public Integer getCounterForTripWithId(Long id) {
        return tripRepository.findById(id).get().getCounter();
    }


}
