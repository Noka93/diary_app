package com.remidiousE.utils;

import com.remidiousE.dto.request.DiaryRequest;
import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.dto.response.DiaryResponse;
import com.remidiousE.dto.response.EntryResponse;
import com.remidiousE.model.Diary;
import com.remidiousE.model.Entry;

public class Mapper {

    public static Diary map(DiaryRequest request){
        Diary diary = new Diary();
        diary.setDiaryId(request.getDiaryId());
        diary.setDate(request.getDate());
        return diary;
    }

    public static DiaryResponse map(Diary savedDiary){
        DiaryResponse response = new DiaryResponse();
        response.setEntry(String.valueOf(savedDiary.getDate()));
        response.setEntry(savedDiary.getEntry());
        return response;
    }
    public static Entry map(EntryRequest request){
        Entry entry = new Entry();
        entry.setTitle(request.getTitle());
        entry.setContent(request.getMessage());
        return entry;
    }

    public static EntryResponse map(Entry saveEntry){
        EntryResponse response = new EntryResponse();
        response.setDate(saveEntry.getDate());
        response.setTitle(saveEntry.getTitle());
        response.setMessage(saveEntry.getContent());
        return response;
    }
}
