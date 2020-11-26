package com.travel_agency.model.destination;

import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.trip.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Table(name = "destination")
public class Destination {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String continent;

    @NotEmpty
    @Column(nullable = false)
    private String country;

    @NotEmpty
    @Column(nullable = false)
    private String city;

    @NotEmpty
    private String airport;

    @OneToMany(mappedBy = "destination",cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Hotel> hotels= new ArrayList<>();

    @OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Trip> trips = new ArrayList<>();


}
