package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.Timeslot;

public interface TimeslotRepository extends CrudRepository<Timeslot, Integer>{
}
