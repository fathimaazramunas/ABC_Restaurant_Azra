package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.TimeslotOption;

public interface TimeslotOptionsRepository extends CrudRepository<TimeslotOption, Integer>{
}
