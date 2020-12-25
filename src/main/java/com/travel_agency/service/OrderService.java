package com.travel_agency.service;

import com.travel_agency.dto.OrderDTO;
import com.travel_agency.dto.ParticipantsDTO;
import com.travel_agency.mapper.OrderMapper;
import com.travel_agency.model.order.Ordero;
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
        return orderRepository.findByStatus(status)
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(OrderMapper.INSTANCE::orderDTO)
                .collect(Collectors.toList());
    }

    public List<ParticipantsDTO> getParticipantsForOrderById(Long id){
        OrderDTO orderDTO = orderRepository.findById(id)
                .map(OrderMapper.INSTANCE::orderDTO)
                .orElseThrow(NoSuchElementException::new);

        return orderDTO.getParticipants();
    }

    public void saveOrder(OrderDTO orderDTO) {
        Ordero ordero = OrderMapper.INSTANCE.dtoToOrder(orderDTO);
        orderRepository.save(ordero);
    }

    public void deleteOrderById(Long id) {
        Ordero ordero = orderRepository.findById(id).orElseThrow(NoSuchElementException::new);
        orderRepository.delete(ordero);
    }

}
