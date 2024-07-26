package com.hoangb0410.Hotel_Server.dto;

import lombok.Data;

import java.util.List;

@Data
public class ReservationResponseDto {

    private Integer totalPages;
    private Integer pageNumber;
    private List<ReservationDto> reservationDtoList;

}
