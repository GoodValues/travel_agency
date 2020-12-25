package com.travel_agency.dto;

import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AdressDTO {


    private Long id;
    private String road;
    private Long roadNumber;
    private String postalCode;
    private String city;
    private String country;
    private User user;
}
