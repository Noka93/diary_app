package com.remidiousE.controller;

import com.remidiousE.dto.request.DiaryRequest;
import com.remidiousE.model.Diary;
import com.remidiousE.service.DiaryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DiaryController {
    @Autowired
    private DiaryService diaryService;


    @PostMapping("/diaries")
    public ResponseEntity<?> createDiary(@RequestBody DiaryRequest request){
        return new ResponseEntity<>(diaryService.saveDiary(request), HttpStatus.CREATED);
    }

    @GetMapping("/diary{id}")

    public Diary getDiaryById(@PathVariable("id") Long id){
        return diaryService.getDiaryById(id);


    }

    @GetMapping("/diaries")
    public List<Diary> getAllDiaries(){
        return diaryService.getAllDiaries();
    }

    @DeleteMapping("/entries/{id}")
    public String deleteEntryById(@PathVariable("id") Long id){
        diaryService.deleteEntryById(id);
        return "Entry Deleted Successfully";
    }
}
