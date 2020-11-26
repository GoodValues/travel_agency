package com.travel_agency.dto;

import com.travel_agency.model.trip.Trip;
import com.travel_agency.model.user.UserRoleNameEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ParticipantsDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private long pesel;
    private LocalDate dateOfBirth;
}