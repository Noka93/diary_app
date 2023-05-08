package com.remidiousE.service;

import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.dto.response.EntryResponse;
import com.remidiousE.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService{

    @Override
    public EntryResponse saveEntry(EntryRequest request) {
        return null;
    }

    @Override
    public List<Entry> getAllEntries() {
        return null;
    }

    @Override
    public void deleteEntryById(Long id) {

    }
}
