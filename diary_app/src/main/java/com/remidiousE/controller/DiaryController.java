package com.remidiousE.controller;

import com.remidiousE.dto.request.DiaryRequest;
import com.remidiousE.model.Diary;
import com.remidiousE.model.Entry;
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


    @PostMapping("/entries")
    public ResponseEntity<?> createEntry(@RequestBody DiaryRequest request){
        return new ResponseEntity<>(diaryService.saveDiary(request), HttpStatus.CREATED);
    }

    @GetMapping("/entries")
    public List<Diary> getAllEntries(){
        return diaryService.getAllEntries();
    }

    @DeleteMapping("/entries/{id}")
    public String deleteEntryById(@PathVariable("id") Long id){
        diaryService.deleteEntryById(id);
        return "Entry Deleted Successfully";
    }
}
