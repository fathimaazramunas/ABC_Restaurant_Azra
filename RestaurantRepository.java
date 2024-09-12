package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{
}
