package com.travel_agency.mapper;

import com.travel_agency.dto.OrderDTO;
import com.travel_agency.model.order.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    static OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderDTO(Order order);
    Order dtoToOrder(OrderDTO orderDTO);

}
