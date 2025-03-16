package dev.jaidsonmda.domain;

import java.time.LocalDate;

public class Individual extends Person {
    private String cpf; // Cadastro de Pessoa Física (CPF)
    private LocalDate dateOfBirth; // Data de nascimento
    private String gender; // Gênero (Masculino, Feminino, Outro)
    private String maritalStatus; // Estado civil
    private String nationality; // Nacionalidade

    public Individual(Long id, String name, String email, String phoneNumber, String address,
                      String cpf, LocalDate dateOfBirth, String gender, String maritalStatus, String nationality) {
        super(id, name, email, phoneNumber, address);
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
    }

    // Getters
    public String getCpf() { return cpf; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getGender() { return gender; }
    public String getMaritalStatus() { return maritalStatus; }
    public String getNationality() { return nationality; }

    @Override
    public String toString() {
        return super.toString() + ", Individual{" +
                "cpf='" + cpf + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
