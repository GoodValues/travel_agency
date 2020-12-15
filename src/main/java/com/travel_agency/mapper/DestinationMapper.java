package com.travel_agency.mapper;

import com.travel_agency.dto.DestinationDTO;
import com.travel_agency.model.destination.Destination;
import org.mapstruct.factory.Mappers;

public interface DestinationMapper {

    static DestinationMapper INSTANCE = Mappers.getMapper(DestinationMapper.class);

    DestinationDTO destinationDTO(Destination destination);
    Destination dtoToDestination(DestinationDTO destinationDTO);


}
