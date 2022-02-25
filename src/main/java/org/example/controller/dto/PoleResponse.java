package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.repository.entity.Fertilization;
import org.example.repository.entity.Notes;
import org.example.repository.entity.Security;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PoleResponse {
    private Long id;
    private double area;
    private String name;
    private String typeOfCrop;
    private List<Fertilization> fertilizations;
    private List<Security> securities;
    private List<Notes> notes;
}
