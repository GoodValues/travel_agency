package com.travel_agency.model;

import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String road;

    private Long roadNumber;

    @NotEmpty
    private String postalCode;

    @NotEmpty
    private String city;

    @NotEmpty
    private String country;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private User user;

}
