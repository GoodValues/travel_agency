package com.travel_agency.dto;

import com.travel_agency.model.hotel.HotelStandardEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HotelDTO {

    private Long id;
    private String name;
    private HotelStandardEnum hotelStandardEnum;
    private String location;
    private String description;
    private DestinationDTO destinationDTO;

}
