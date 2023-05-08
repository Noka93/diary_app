package com.remidiousE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long diaryId;

    private LocalDate date;
}
