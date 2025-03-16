package dev.jaidsonmda.entity;

import dev.jaidsonmda.domain.CardStatus;
import dev.jaidsonmda.domain.CreditCardType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="card")
public class Card extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "card_seq")
    private Long id;

    private String cardNumber;
    private String cardHolder;
    private LocalDate expirationDate;
    private String securityCode;
    private String brand;
    private BigDecimal creditLimit;
    private BigDecimal availableBalance;
    private CardStatus status;
    private CreditCardType type;
    private BigDecimal interestRate;
    private BigDecimal currentBill;
    private LocalDate billingClosingDate;
    private LocalDate billingDueDate;
}
