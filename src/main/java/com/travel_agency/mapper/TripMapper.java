package com.travel_agency.mapper;

import com.travel_agency.dto.TripDto;
import com.travel_agency.model.trip.Trip;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TripMapper {

    static TripMapper INSTANCE = Mappers.getMapper(TripMapper.class);

    TripDto tripDto(Trip trip);
    Trip dtoToTrip(TripDto tripDto);

}
