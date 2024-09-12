package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer>{
}
