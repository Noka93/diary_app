package com.remidiousE.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long diaryId;

    private LocalDate date;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Entry> entries = new ArrayList<>();


    public void setEntry(Entry entry) {
        entries.add(entry);
    }
}
