package com.s.d.Library_Management_System.service;

import com.s.d.Library_Management_System.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;
}
