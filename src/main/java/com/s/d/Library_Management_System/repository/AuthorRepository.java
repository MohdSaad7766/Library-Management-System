package com.s.d.Library_Management_System.repository;

import com.s.d.Library_Management_System.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
