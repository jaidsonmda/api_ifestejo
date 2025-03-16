package dev.jaidsonmda.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="legal_entity")
public class LegalEntity extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "legal_entity_seq")
    private long id;
    private String name; // Nome
    private String email; // E-mail
    private String phoneNumber; // Número de telefone
    private String address;
    private String cnpj; // Cadastro Nacional da Pessoa Jurídica (CNPJ)
    private String companyName; // Razão social
    private String tradeName; // Nome fantasia
    private LocalDate foundationDate; // Data de fundação
    private String businessType; // Tipo de negócio (MEI, Ltda, S/A, etc.)
    private String legalRepresentative; // Representante legal
}
