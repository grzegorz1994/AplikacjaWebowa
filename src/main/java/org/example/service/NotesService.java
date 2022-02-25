package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.NotesRequest;
import org.example.repository.NotesRepository;
import org.example.repository.entity.Notes;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotesService {
    private final NotesRepository notesRepository;

    public void createNotes(final NotesRequest notesRequest){
         notesRepository.save(Notes.builder()
                .message(notesRequest.getMessage())
                .poleId(notesRequest.getPoleId())
                .build());
    }
}
