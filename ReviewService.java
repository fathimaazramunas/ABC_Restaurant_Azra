package com.azra.restaurant_reservation.service;

import com.azra.restaurant_reservation.entity.Review;
import com.azra.restaurant_reservation.entity.request.ReviewRequest;

import java.util.List;

public interface ReviewService {
    Review saveReview(ReviewRequest data);
//    List<Object[]> getReviews(int restaurantId);
    List<Review> getReviews(int restaurantId);
}
