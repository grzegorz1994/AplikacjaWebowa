package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pole {
    @Id
    @GeneratedValue
    @Column(name = "POLE_ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String name;
    @Column(name = "AREA")
    private double area;
    @Column(name = "TYPE_OF_CROP")
    private String typeOfCrop;
    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "POLE_ID")
    private List<Fertilization> fertilizations;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "POLE_ID")
    private List<Security> securities;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLE_ID")
    private List<Notes> notes;

    @Override
    public String toString() {
        return "Pole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", typeOfCrop='" + typeOfCrop + '\'' +
                ", fertilizations=" + fertilizations +
                ", securities=" + securities +
                '}';
    }
}
