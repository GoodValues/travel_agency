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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TripDTO getTripDTO() {
        return tripDTO;
    }

    public void setTripDTO(TripDTO tripDTO) {
        this.tripDTO = tripDTO;
    }

    public List<ParticipantsDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantsDTO> participants) {
        this.participants = participants;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public OrderStatusEnum getOrderStatusEnum() {
        return orderStatusEnum;
    }

    public void setOrderStatusEnum(OrderStatusEnum orderStatusEnum) {
        this.orderStatusEnum = orderStatusEnum;
    }
}
