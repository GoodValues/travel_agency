package com.travel_agency.mapper;

import com.travel_agency.dto.HotelDto;
import com.travel_agency.dto.TripDto;
import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {

    static HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    HotelDto hotelDto(Hotel hotel);
    Hotel dtoToHotel(HotelDto hotelDto);

}
