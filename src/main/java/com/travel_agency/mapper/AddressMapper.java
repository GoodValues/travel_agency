package com.travel_agency.mapper;

import com.travel_agency.dto.AddressDTO;
import com.travel_agency.dto.DestinationDTO;
import com.travel_agency.model.address.Address;
import com.travel_agency.model.destination.Destination;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AddressMapper {

    static AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO addressDTO(Address address);
    Address dtoToAddress(AddressDTO addressDTO);


}
