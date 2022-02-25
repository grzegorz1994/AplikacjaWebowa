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
public class Security {
    @Id
    @GeneratedValue
    @Column(name = "SECURITY_ID")
    private Long id;
    @Column(name = "MUSHROOM")
    private String mushroom;
    @Column(name = "WORM")
    private String worm;
    @Column(name = "WEED")
    private String weed;
    @Column(name = "POLE_ID")
    private Long poleId;

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", mushroom='" + mushroom + '\'' +
                ", worm='" + worm + '\'' +
                ", weed='" + weed + '\'' +
                '}';
    }
}
