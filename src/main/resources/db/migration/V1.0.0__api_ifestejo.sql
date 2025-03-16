
    create sequence card_seq start with 1 increment by 50;

    create sequence individual_seq start with 1 increment by 50;

    create sequence local_entity_seq start with 1 increment by 50;

    create table Card (
        id bigint not null,
        availableBalance numeric(38,2),
        billingClosingDate date,
        billingDueDate date,
        brand varchar(255),
        cardHolder varchar(255),
        cardNumber varchar(255),
        creditLimit numeric(38,2),
        currentBill numeric(38,2),
        expirationDate date,
        interestRate numeric(38,2),
        securityCode varchar(255),
        status smallint check (status between 0 and 3),
        type smallint check (type between 0 and 3),
        primary key (id)
    );

    create table Individual (
        id bigint not null,
        address varchar(255),
        cpf varchar(255),
        dateOfBirth date,
        email varchar(255),
        gender varchar(255),
        maritalStatus varchar(255),
        name varchar(255),
        nationality varchar(255),
        phoneNumber varchar(255),
        primary key (id)
    );

    create table LegalEntity (
        id bigint not null,
        address varchar(255),
        businessType varchar(255),
        cnpj varchar(255),
        companyName varchar(255),
        email varchar(255),
        foundationDate date,
        legalRepresentative varchar(255),
        name varchar(255),
        phoneNumber varchar(255),
        tradeName varchar(255),
        primary key (id)
    );
