package com.remidiousE.dto.response;

import com.remidiousE.model.Entry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiaryResponse {

    private LocalDate date;

    private Entry entry;
}
