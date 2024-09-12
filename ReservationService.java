package com.azra.restaurant_reservation.service;

import com.azra.restaurant_reservation.entity.Reservation;
import com.azra.restaurant_reservation.entity.request.ReservationRequest;

import java.util.List;

public interface ReservationService {
    public Reservation saveReservation(ReservationRequest data);
    public List<Reservation> getReservations(String userName);
    public List<Reservation> getOwnerReservations(String userName);
}
