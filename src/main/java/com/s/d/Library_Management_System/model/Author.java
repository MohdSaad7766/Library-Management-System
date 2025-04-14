package com.s.d.Library_Management_System.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Authers")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Auther_ID",updatable = false)
    private UUID id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "gender",nullable = false)
    private Gender gender;

    @Column(name = "country",nullable = false)
    private String country;

    @Column(name = "rating",nullable = false)
    private double rating;

    @JsonManagedReference
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

//  id, name , email, gender, country, rating , bookList

}
