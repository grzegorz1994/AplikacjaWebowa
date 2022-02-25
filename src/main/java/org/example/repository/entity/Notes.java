package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "NOTES")
public class Notes {
    @Id
    @GeneratedValue
    @Column(name = "NOTES_ID")
    private Long id;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "POLE_ID")
    private Long poleId;
}
