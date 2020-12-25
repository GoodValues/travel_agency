package com.travel_agency.controller;

import com.travel_agency.dto.OrderDTO;
import com.travel_agency.dto.ParticipantsDTO;
import com.travel_agency.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ResponseBody
    @GetMapping("/allOrders")
    public List<OrderDTO> getAllOrders(){
        return orderService.getAllOrders();
    }

    @ResponseBody
    @GetMapping("/order/{id}")
    public OrderDTO getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @ResponseBody
    @GetMapping("/order/{status}")
    public List<OrderDTO> getOrdersByStatus(@PathVariable String status){
        return orderService.getOrderByStatus(status);
    }

    @ResponseBody
    @GetMapping("/order/{id}/participants")
    public List<ParticipantsDTO> getParticipantsForOrderById(@PathVariable Long id){
        return orderService.getParticipantsForOrderById(id);
    }

    @GetMapping("/saveOrder")
    public void saveOrder(@RequestBody OrderDTO orderDTO){
        orderService.saveOrder(orderDTO);
    }

    @PostMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteOrderById(id);
    }





}
