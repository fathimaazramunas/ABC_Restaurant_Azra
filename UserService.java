package com.azra.restaurant_reservation.service;

import com.azra.restaurant_reservation.entity.User;

public interface UserService {
    public User saveUser(User user);
    public User findByUserName(String name);
    public User findUserById(int id);
}
