package com.travel_agency.service;

import com.travel_agency.dto.HotelDTO;
import com.travel_agency.mapper.HotelMapper;
import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    HotelRepository hotelRepository;

    public List<HotelDTO> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        List<HotelDTO> result = new ArrayList<>();
        for (Hotel hotel : hotels)
            result.add(HotelMapper.INSTANCE.hotelDto(hotel));
        return result;
    }
}
