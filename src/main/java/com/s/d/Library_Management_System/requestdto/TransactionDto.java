package com.s.d.Library_Management_System.requestdto;



import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionDto {


    private LocalDate dueDate;

    private int cardId;

    private int bookId;
}
