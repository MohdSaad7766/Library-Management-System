package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.model.Card;
import com.s.d.Library_Management_System.requestdto.CardDto;

public class CardConverter {
    public static Card cardConverter(CardDto cardDto){
        Card card = new Card();

        card.setCardStatus(cardDto.getCardStatus());

        return card;
    }
}
