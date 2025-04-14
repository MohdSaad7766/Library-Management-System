package com.s.d.Library_Management_System.requestdto;


import com.s.d.Library_Management_System.enums.CardStatus;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardDto {
    private CardStatus cardStatus;

    private UUID studentId;

}
