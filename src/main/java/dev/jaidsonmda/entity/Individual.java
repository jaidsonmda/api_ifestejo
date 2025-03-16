package dev.jaidsonmda.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="individual")
public final class Individual extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "individual_seq")
    private long id;
    private String name; // Nome
    private String email; // E-mail
    private String phoneNumber; // Número de telefone
    private String address;
    private String cpf; // Cadastro de Pessoa Física (CPF)
    private LocalDate dateOfBirth; // Data de nascimento
    private String gender; // Gênero (Masculino, Feminino, Outro)
    private String maritalStatus; // Estado civil
    private String nationality; // Nacionalidade
}
