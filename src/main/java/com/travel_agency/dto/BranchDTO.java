package com.travel_agency.dto;

import com.travel_agency.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BranchDTO {

    private Long id;
    private Address address;
}
