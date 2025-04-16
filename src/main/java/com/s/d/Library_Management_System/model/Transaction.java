package com.s.d.Library_Management_System.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Transaction_ID",updatable = false)
    private int id;

    @Column(name = "transaction_date",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDate transactionDate;

    @Column(name = "fine_amount")
    private double fineAmount;

    @Column(name = "due_date",nullable = false)
    private LocalDate dueDate;

    @Column(name = "transaction_type",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "card_id",nullable = false)
    private Card card;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "book_id",nullable = false)
    private Book book;

//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn
//    private Book book;


//    id, transactionDate, fineAmt, dueDate, transactionType(BORROW or RETURN or RENEW), card1, book1
}
