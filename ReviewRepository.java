package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer>{
}
