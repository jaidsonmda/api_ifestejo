package dev.jaidsonmda.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
public class Card extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "veiculos_SEQ")
    private Long id;
}
