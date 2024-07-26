package com.hoangb0410.Hotel_Server.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoomsResponseDto {
    private List<RoomDto> roomDtoList;

    private Integer totalPages;

    private Integer pageNumber;
}
