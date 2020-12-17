package com.travel_agency.service;

import com.travel_agency.dto.OrderDTO;
import com.travel_agency.dto.ParticipantDTO;
import com.travel_agency.mapper.OrderMapper;
import com.travel_agency.model.order.Order;
import com.travel_agency.model.order.OrderStatusEnum;
import com.travel_agency.model.participant.Participant;
import com.travel_agency.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(OrderMapper.INSTANCE::orderDTO)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll()
                .stream()
                .map(OrderMapper.INSTANCE::orderDTO)
                .collect(Collectors.toList());
    }

    public List<OrderDTO> getOrderByStatus(String status) {
        return orderRepository.findAllByOrderStatusEnum(status)
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(OrderMapper.INSTANCE::orderDTO)
                .collect(Collectors.toList());
    }

    public List<ParticipantDTO> getParticipantsForOrderById(Long id){
        OrderDTO orderDTO = orderRepository.findById(id)
                .map(OrderMapper.INSTANCE::orderDTO)
                .orElseThrow(NoSuchElementException::new);

        return orderDTO.getParticipants();
    }

    public void saveOrder(OrderDTO orderDTO) {
        Order order = OrderMapper.INSTANCE.dtoToOrder(orderDTO);
        orderRepository.save(order);
    }

    public void deleteOrderById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(NoSuchElementException::new);
        orderRepository.delete(order);
    }

}
