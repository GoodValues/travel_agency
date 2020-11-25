package com.travel_agency.model.trip;

import com.travel_agency.model.destination.Destination;
import com.travel_agency.model.hotel.Hotel;
import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat
    private LocalDate dateFrom;

    @DateTimeFormat
    private LocalDate dateTo;

    @DurationUnit(ChronoUnit.DAYS)
    private Duration duration;

    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;

    @Enumerated(EnumType.STRING)
    private TripTypeEnum tripType;

    @Enumerated(EnumType.STRING)
    private TripAlimentationEnum tripAlimentationEnum;

    private String description;
    private String pictureUrl;

    @Enumerated(EnumType.STRING)
    private TripStatusEnum status;
    private Integer peopleLimit;

    @ManyToOne
    @JoinColumn(name ="destination_id")
    private Destination destination;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
            })
    @JoinTable(name = "user_trip",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.ALL})
    @JoinTable(name = "hotel_trip",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "hotel_id"))
    private List<Hotel> hotels = new ArrayList<>();

}
