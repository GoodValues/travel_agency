package com.travel_agency.mapper;

import com.travel_agency.dto.OrderDTO;
import com.travel_agency.model.order.Ordero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    static OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderDTO(Ordero ordero);
    Ordero dtoToOrder(OrderDTO orderDTO);

}
