package com.remidiousE.service;

import com.remidiousE.dto.request.EntryRequest;
import com.remidiousE.dto.response.EntryResponse;
import com.remidiousE.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EntryService {

    EntryResponse saveEntry(EntryRequest request);

    Optional<Entry> getEntryById(Long id);

    List<Entry> getAllEntries();

    void deleteEntryById(Long id);

    Entry updateEntryById(Long entryId, Entry entry);
}
