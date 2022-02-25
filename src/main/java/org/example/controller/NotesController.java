package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.NotesRequest;
import org.example.service.NotesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class NotesController {
    private final NotesService notesService;

    @PostMapping(path = "/api/createNotes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createNotes(@RequestBody NotesRequest notesRequest){
        notesService.createNotes(notesRequest);
    }
}
