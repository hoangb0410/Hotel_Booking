package com.hoangb0410.Hotel_Server.services.customer.room;

import com.hoangb0410.Hotel_Server.dto.RoomsResponseDto;

public interface RoomService {
    RoomsResponseDto getAvailableRooms(int pageNumber);
}
