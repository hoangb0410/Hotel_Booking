package com.hoangb0410.Hotel_Server.services.customer.booking;

import com.hoangb0410.Hotel_Server.dto.ReservationDto;
import com.hoangb0410.Hotel_Server.dto.ReservationResponseDto;

public interface BookingService {
    boolean postReservation(ReservationDto reservationDto);
    ReservationResponseDto getAllReservationsByUserId(Long userId, int pageNumber);
}
