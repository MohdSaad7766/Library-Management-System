package com.s.d.Library_Management_System.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Card_ID",updatable = false)
    private int id;

    @Column(name = "card_status",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @Column(name = "creation_date",nullable = false)
    @CreationTimestamp
    private LocalDate creationDate;

    @Column(name = "updation_date",nullable = false)
    @UpdateTimestamp
    private LocalDate updateDate;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "card")
//    private List<Book> bookList;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<Transaction> transactionList;




//    id, cardstatus, creationDate, updateDate, student1 , transaction*
}
