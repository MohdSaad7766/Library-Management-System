package com.s.d.Library_Management_System.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.Edition;
import jakarta.persistence.*;
import com.s.d.Library_Management_System.enums.Category;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(name = "Book_ID",updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "pages",nullable = false)
    private int pages;

    @Column(name = "publisher_name")
    private String publisherName;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @Column(name = "edition",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Edition edition;

    @Column(name = "category",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column(name = "price",nullable = false)
    private float price;

    @Column(name = "rack_no",nullable = false)
    private String rackNo;

    @Column(name = "total_quantity", nullable = false)
    private int totalQuantity;

    @Column(name = "available_quantity", nullable = false)
    private int availableQuantity;


    @JsonManagedReference
    @OneToMany(mappedBy = "book")
    private List<Transaction> transaction;

//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn
//    private Card card;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "book")
//    private List<Transaction> transactionList;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "auther_id",nullable = false)
    private Author author;
// id, title, pages, publisher name, publisedDate, edition, category, price, rackNo,totalQuantity, availableQuantity, transaction*, author1
}
