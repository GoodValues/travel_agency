package com.travel_agency.dto;

import com.travel_agency.model.destination.Destination;
import com.travel_agency.model.trip.TripStatusEnum;
import com.travel_agency.model.trip.TripTypeEnum;
import com.travel_agency.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TripDto {

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

    private Destination destination;

    private List<User> users = new ArrayList<>();
}
