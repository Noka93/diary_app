package com.remidiousE.controller;

import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.model.Entry;
import com.remidiousE.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntryController {
    @Autowired
    private EntryService entryService;

    @PostMapping("/entry")
    public ResponseEntity<?> createEntry(@RequestBody EntryRequest request){
        return new ResponseEntity<>(entryService.saveEntry(request), HttpStatus.CREATED);
    }

    @GetMapping("/entry/{id}")
    public Optional<Entry> getEntryById(@PathVariable("id") Long id){
        return entryService.getEntryById(id);
    }

    @GetMapping("/entries")
    public List<Entry> getAllEntries(){
        return entryService.getAllEntries();
    }

    @PutMapping("/entry/{id}")
    public  Entry updateEntryById(@PathVariable("id") Long entryId, Entry entry){
        return entryService.updateEntryById(entryId, entry);
    }
    @DeleteMapping("/entries/{id}")
    public String deleteEntryById(@PathVariable("id") Long id){
        entryService.deleteEntryById(id);
        return "Entry Deleted Successfully";
    }
}
