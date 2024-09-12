package com.azra.restaurant_reservation.service;

import java.util.List;

import com.azra.restaurant_reservation.entity.User;

public interface GenericService {
    User findByUsername(String username);
    List<User> findAllUsers();
}
