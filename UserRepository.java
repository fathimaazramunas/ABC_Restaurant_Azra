package com.azra.restaurant_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.azra.restaurant_reservation.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUserName(String userName);
    User findById(int id);
}
