package com.s.d.Library_Management_System.repository;

import com.s.d.Library_Management_System.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card,  Integer> {
}
