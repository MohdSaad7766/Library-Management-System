package com.s.d.Library_Management_System.requestdto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.s.d.Library_Management_System.enums.Category;
import com.s.d.Library_Management_System.enums.Edition;
import com.s.d.Library_Management_System.model.Author;
import com.s.d.Library_Management_System.model.Transaction;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDto {
    private String title;

    private int pages;

    private String publisherName;

    private LocalDate publishedDate; //yyyy-mm-dd

    private Edition edition;

    private Category category;

    private float price;

    private String rackNo;

    private int totalQuantity;

//    private int availableQuantity;

    private int authorId;
}
