package com.remidiousE.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UserResponse {
    private Long id;

    private LocalDate date;
    private String content;
}
