package com.remidiousE.service;

import com.remidiousE.dto.request.DiaryRequest;
import com.remidiousE.dto.response.DiaryResponse;
import com.remidiousE.model.Diary;
import com.remidiousE.repository.DiaryRepository;
import com.remidiousE.utils.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class DiaryServiceImpl implements DiaryService{

    @Autowired
    private DiaryRepository diaryRepository;

    public DiaryResponse saveDiary(@RequestBody DiaryRequest request) {
        Diary diary = Mapper.map(request);
        Diary savedDiary = diaryRepository.save(diary);
        return Mapper.map(savedDiary);

    }

    @Override
    public Diary getDiaryById(Long id) {
        return null;
    }

    @Override
    public List<Diary> getAllDiaries() {
        return diaryRepository.findAll();
    }

    @Override
    public void deleteEntryById(Long id) {
        diaryRepository.deleteById(id);
    }

}
