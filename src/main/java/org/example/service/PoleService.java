package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.PoleRequest;
import org.example.controller.dto.PoleResponse;
import org.example.repository.PoleRepository;
import org.example.repository.entity.Pole;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoleService {
    private final PoleRepository poleRepository;

    public void createPole(final PoleRequest poleRequest){
        poleRepository.save(Pole.builder()
                .area(poleRequest.getArea())
                .name(poleRequest.getName())
                .typeOfCrop(poleRequest.getTypeOfCrop())
                .build());
    }

    public PoleResponse findPole(final Long id){
        return poleRepository.findById(id)
                .map(pole -> PoleResponse.builder()
                        .id(pole.getId())
                        .area(pole.getArea())
                        .name(pole.getName())
                        .typeOfCrop(pole.getTypeOfCrop())
                        .fertilizations(pole.getFertilizations())
                        .securities(pole.getSecurities())
                        .notes(pole.getNotes())
                        .build())
                .orElseThrow(() -> new IllegalArgumentException("Pole o id " + id + " nie istnieje"));
    }
}
