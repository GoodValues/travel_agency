package com.travel_agency.model.trip;

import com.travel_agency.model.destination.Destination;
import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private Duration duration;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private TripTypeEnum tripType;
    private String description;
    private String pictureUrl;
    private TripStatusEnum status;
    private Integer peopleLimit;
    @OneToOne
    private Destination destination;
    @ManyToMany// joinColumns, fetching, kaskady po zrobieniu User
    private List<User> users = new ArrayList<>();

}
