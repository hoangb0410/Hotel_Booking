package com.hoangb0410.Hotel_Server.services.admin.rooms;

import com.hoangb0410.Hotel_Server.dto.RoomDto;
import com.hoangb0410.Hotel_Server.dto.RoomsResponseDto;

public interface RoomsService {
    boolean postRoom(RoomDto roomDto);
    RoomsResponseDto getAllRooms(int pageNumber);
    RoomDto getRoomById(Long id);
    boolean updateRoom(Long id, RoomDto roomDto);
    void deleteRoom(Long id);
}

