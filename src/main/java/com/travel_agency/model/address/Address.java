package com.travel_agency.model.address;

import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String road;

    @NotEmpty
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
