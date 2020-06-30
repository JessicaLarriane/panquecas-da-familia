package com.luis.pereira.panquecasdafamilia.model;

import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Component

//Lombok
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString

//JPA
@Entity
@Table(name = "pancake")
public class PancakeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pancake")
    private long id_pancake;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private double value;

    @Column(name = "amount")
    private int amount;

}
