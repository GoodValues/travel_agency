package com.travel_agency.dto;

import com.travel_agency.model.order.OrderStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderDTO {
    private Long id;
    private TripDTO tripDTO;
    private List<ParticipantsDTO> participants = new ArrayList<>();
    private BigDecimal balance;
    private UserDTO userDTO;
    private OrderStatusEnum orderStatusEnum;
}
