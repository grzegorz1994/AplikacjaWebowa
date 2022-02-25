package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.SecurityRequest;
import org.example.service.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurityController {
    private final SecurityService securityService;

    @PostMapping(path = "/api/createSecurity")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createSecurity(@RequestBody SecurityRequest securityRequest){
        securityService.createSecurity(securityRequest);
    }
}
