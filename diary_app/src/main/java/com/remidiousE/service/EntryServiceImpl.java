package com.remidiousE.service;

import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.dto.response.EntryResponse;
import com.remidiousE.model.Entry;
import com.remidiousE.repository.EntryRepository;
import com.remidiousE.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EntryServiceImpl implements EntryService{
    @Autowired
    private EntryRepository entryRepository;

    @Override
    public EntryResponse saveEntry(@RequestBody EntryRequest request) {
        Entry entry = Mapper.map(request);
        Entry savedEntry = entryRepository.save(entry);
        return Mapper.map(savedEntry);
    }

    @Override
    public Optional<Entry> getEntryById(Long id) {
        Optional<Entry> entry = entryRepository.findById(id);
        return entry;
    }

    @Override
    public List<Entry> getAllEntries() {
        return entryRepository.findAll();
    }

    @Override
    public void deleteEntryById(Long id) {
        entryRepository.deleteById(id);

    }

    @Override
    public Entry updateEntryById(Long entryId, Entry entry) {
        entryRepository.findById(entryId).get();
        return null;
    }
}
