package com.s.d.Library_Management_System.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.Department;

import com.s.d.Library_Management_System.enums.Gender;
import com.s.d.Library_Management_System.enums.Semester;
import com.s.d.Library_Management_System.enums.BloodGroup;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_ID", updatable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile_no", nullable = false)
    private String mobileNo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "blood_group", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "department", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Department department;

    @Column(name = "semester", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Semester semester;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "Date_Of_Birth", nullable = false)
    private LocalDate dob;

    @Column(name = "gender", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "section", nullable = false)
    private String section;

    @JsonManagedReference
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Card card;

//    id, name, mobile, email,blood group, dept, sem, address1, dob, gender, section, card1
}
