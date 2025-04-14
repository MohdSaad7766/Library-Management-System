package com.s.d.Library_Management_System.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Addresses")
public class Address {
//    id,houseNo,street,city,state,pincode
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Address_ID",updatable = false)
    private UUID id;

    @Column(name = "house_no",nullable = false)
    private int houseNo;

    @Column(name = "street",nullable = false)
    private String street;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "state",nullable = false)
    private String state;

    @Column(name = "pin_code",nullable = false)
    private int pincode;

}
