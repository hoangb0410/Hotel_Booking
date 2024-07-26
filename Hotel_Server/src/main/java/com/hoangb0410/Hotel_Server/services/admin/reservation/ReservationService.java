package com.hoangb0410.Hotel_Server.services.admin.reservation;

import com.hoangb0410.Hotel_Server.dto.ReservationResponseDto;

public interface ReservationService {
    ReservationResponseDto getAllReservations(int pageNumber);
    boolean changeReservationStatus(Long id, String status);
}
