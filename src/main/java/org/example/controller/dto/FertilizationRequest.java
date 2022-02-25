package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FertilizationRequest {
    private String fertilizationOrganic;
    private String fertilizationMineral;
    private Long poleId;
}
