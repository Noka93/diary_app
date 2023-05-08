package com.remidiousE.service;

import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntryService {

    Object saveEntry(EntryRequest request);

    List<Entry> getAllEntries();

    void deleteEntryById(Long id);
}
