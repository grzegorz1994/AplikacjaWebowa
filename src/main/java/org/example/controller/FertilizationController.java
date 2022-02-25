package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.FertilizationRequest;
import org.example.service.FertilizationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FertilizationController {
    private final FertilizationService fertilizationService;

    @PostMapping(path = "/api/createFertilization")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createFertilization(@RequestBody FertilizationRequest fertilizationRequest){
        fertilizationService.createFertilization(fertilizationRequest);
    }
}
