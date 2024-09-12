package com.azra.restaurant_reservation.service;

import java.util.List;

import com.azra.restaurant_reservation.entity.Restaurant;
import com.azra.restaurant_reservation.entity.TimeslotOption;

public interface TimeslotOptionService {
    public void saveTimeslotOptions(List<String> timeslots, Restaurant restaurant);
    public TimeslotOption findById(Integer id);
}
