package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.FertilizationRequest;
import org.example.repository.FertilizationRepository;
import org.example.repository.entity.Fertilization;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FertilizationService {
    private final FertilizationRepository fertilizationRepository;

    public void createFertilization(final FertilizationRequest fertilizationRequest){
        fertilizationRepository.save(Fertilization.builder()
                .fertilizationOrganic(fertilizationRequest.getFertilizationOrganic())
                .fertilizationMineral(fertilizationRequest.getFertilizationMineral())
                .poleId(fertilizationRequest.getPoleId())
                .build());
    }
}
