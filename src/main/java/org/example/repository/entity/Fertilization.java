package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fertilization {
    @Id
    @GeneratedValue
    @Column(name = "FERTILIZATION_ID")
    private Long id;
    @Column(name = "FERTILIZATION_ORGANIC")
    private String fertilizationOrganic;
    @Column(name = "FERTILIZATION_MINERAL")
    private String fertilizationMineral;
    @Column(name = "POLE_ID")
    private Long poleId;

    @Override
    public String toString() {
        return "Fertilization{" +
                "id=" + id +
                ", fertilizationOrganic='" + fertilizationOrganic + '\'' +
                ", fertilizationMineral='" + fertilizationMineral + '\'' +
                '}';
    }
}
