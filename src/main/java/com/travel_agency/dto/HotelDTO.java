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
    private String hotelName;
    private HotelStandardEnum hotelStandardEnum;
    private String description;
    private DestinationDTO destinationDTO;
}
