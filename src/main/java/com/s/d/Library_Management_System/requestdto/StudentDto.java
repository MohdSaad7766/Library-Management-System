package com.s.d.Library_Management_System.requestdto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.BloodGroup;
import com.s.d.Library_Management_System.enums.Department;
import com.s.d.Library_Management_System.enums.Gender;
import com.s.d.Library_Management_System.enums.Semester;
import com.s.d.Library_Management_System.model.Address;
import com.s.d.Library_Management_System.model.Card;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto
{
    private String name;

    private String mobileNo;

    private String email;

    private BloodGroup bloodGroup;

    private Department department;

    private Semester semester;

    private AddressDto addressDto;

    private LocalDate dob;

    private Gender gender;

    private String section;

}
