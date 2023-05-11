package com.remidiousE.service;

import com.remidiousE.dto.request.DiaryRequest;
import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.dto.response.DiaryResponse;
import com.remidiousE.dto.response.EntryResponse;
import com.remidiousE.model.Diary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiaryService {
    DiaryResponse saveDiary(DiaryRequest request);

    Diary getDiaryById(Long id);

    List<Diary> getAllDiaries();

    void deleteEntryById(Long id);

}
