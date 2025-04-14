package com.s.d.Library_Management_System.requestdto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressDto {
    private int houseNo;

    private String street;

    private String city;

    private String state;

    private int pincode;
}
