package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.SecurityRequest;
import org.example.repository.SecurityRepository;
import org.example.repository.entity.Security;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecurityService {
    private final SecurityRepository securityRepository;

    public void createSecurity(final SecurityRequest securityRequest){
        securityRepository.save(Security.builder()
                .mushroom(securityRequest.getMushroom())
                .weed(securityRequest.getWeed())
                .worm(securityRequest.getWorm())
                .poleId(securityRequest.getPoleId())
                .build());
    }
}
