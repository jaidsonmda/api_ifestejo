package dev.jaidsonmda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Card {
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

    public Card(String cardNumber, String cardHolder, LocalDate expirationDate,
                      String securityCode, String brand, BigDecimal creditLimit,
                      CreditCardType type, BigDecimal interestRate, LocalDate billingClosingDate,
                      LocalDate billingDueDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.brand = brand;
        this.creditLimit = creditLimit;
        this.availableBalance = creditLimit;
        this.status = CardStatus.ACTIVE;
        this.type = type;
        this.interestRate = interestRate;
        this.currentBill = BigDecimal.ZERO;
        this.billingClosingDate = billingClosingDate;
        this.billingDueDate = billingDueDate;
    }

    // Método para realizar uma compra
    public boolean makePurchase(BigDecimal amount) {
        if (status == CardStatus.ACTIVE && availableBalance.compareTo(amount) >= 0) {
            availableBalance = availableBalance.subtract(amount);
            currentBill = currentBill.add(amount);
            return true;
        }
        return false;
    }

    // Método para efetuar pagamento
    public void makePayment(BigDecimal amount) {
        currentBill = currentBill.subtract(amount);
        availableBalance = availableBalance.add(amount);
        if (availableBalance.compareTo(creditLimit) > 0) {
            availableBalance = creditLimit;
        }
        if (currentBill.compareTo(BigDecimal.ZERO) < 0) {
            currentBill = BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + maskCardNumber() + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", expirationDate=" + expirationDate +
                ", brand='" + brand + '\'' +
                ", creditLimit=" + creditLimit +
                ", availableBalance=" + availableBalance +
                ", status=" + status +
                ", type=" + type +
                ", interestRate=" + interestRate +
                ", currentBill=" + currentBill +
                ", billingClosingDate=" + billingClosingDate +
                ", billingDueDate=" + billingDueDate +
                '}';
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
