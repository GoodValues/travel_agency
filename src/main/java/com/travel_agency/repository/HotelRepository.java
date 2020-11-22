package com.travel_agency.repository;

import com.travel_agency.model.hotel.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
