package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.PoleRequest;
import org.example.controller.dto.PoleResponse;
import org.example.service.PoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PoleController {
    private final PoleService poleService;

    @PostMapping(path = "/api/createPole")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createPole(@RequestBody PoleRequest pole){
        poleService.createPole(pole);
    }

    @GetMapping(path = "/api/displayPole")
    public ResponseEntity<PoleResponse> findPole(@RequestParam Long id){
        final PoleResponse pole = poleService.findPole(id);
        return new ResponseEntity<>(pole, HttpStatus.OK);
    }
}
