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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelStandardEnum getHotelStandardEnum() {
        return hotelStandardEnum;
    }

    public void setHotelStandardEnum(HotelStandardEnum hotelStandardEnum) {
        this.hotelStandardEnum = hotelStandardEnum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DestinationDTO getDestinationDTO() {
        return destinationDTO;
    }

    public void setDestinationDTO(DestinationDTO destinationDTO) {
        this.destinationDTO = destinationDTO;
    }
}
