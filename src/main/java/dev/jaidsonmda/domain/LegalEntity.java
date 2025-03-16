package dev.jaidsonmda.domain;

import java.time.LocalDate;

public class LegalEntity extends Person {
    private String cnpj; // Cadastro Nacional da Pessoa Jurídica (CNPJ)
    private String companyName; // Razão social
    private String tradeName; // Nome fantasia
    private LocalDate foundationDate; // Data de fundação
    private String businessType; // Tipo de negócio (MEI, Ltda, S/A, etc.)
    private String legalRepresentative; // Representante legal

    public LegalEntity(Long id, String name, String email, String phoneNumber, String address,
                       String cnpj, String companyName, String tradeName, LocalDate foundationDate,
                       String businessType, String legalRepresentative) {
        super(id, name, email, phoneNumber, address);
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.tradeName = tradeName;
        this.foundationDate = foundationDate;
        this.businessType = businessType;
        this.legalRepresentative = legalRepresentative;
    }

    // Getters
    public String getCnpj() { return cnpj; }
    public String getCompanyName() { return companyName; }
    public String getTradeName() { return tradeName; }
    public LocalDate getFoundationDate() { return foundationDate; }
    public String getBusinessType() { return businessType; }
    public String getLegalRepresentative() { return legalRepresentative; }

    @Override
    public String toString() {
        return super.toString() + ", LegalEntity{" +
                "cnpj='" + cnpj + '\'' +
                ", companyName='" + companyName + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", foundationDate=" + foundationDate +
                ", businessType='" + businessType + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                '}';
    }
}
