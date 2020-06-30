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
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id_client;

    @Column(name = "name")
    private String name;

    @Column(name = "street")
    private String street;

    @Column(name = "houseNumber")
    private int houseNumber;

}
