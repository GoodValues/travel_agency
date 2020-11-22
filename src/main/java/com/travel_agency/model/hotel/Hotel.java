package com.travel_agency.model.hotel;

import com.travel_agency.model.destination.Destination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private HotelStandardEnum standard;
    private String description;
    @ManyToOne//joiny itp do dopracowania po zrobieniu klasy CIty
    private Destination destionation;

}
