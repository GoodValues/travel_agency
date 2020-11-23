package com.travel_agency.dto;

import com.travel_agency.model.trip.Trip;
import com.travel_agency.model.user.UserRoleNameEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private UserRoleNameEnum roleName;
    private List<Trip> trips = new ArrayList<>();
}
