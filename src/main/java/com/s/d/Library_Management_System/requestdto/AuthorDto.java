package com.s.d.Library_Management_System.requestdto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.Gender;
import com.s.d.Library_Management_System.model.Book;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthorDto {
    private String name;

    private String email;

    private Gender gender;

    private String country;

    private double rating;

}
