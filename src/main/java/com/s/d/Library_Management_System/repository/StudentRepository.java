package com.s.d.Library_Management_System.repository;

import com.s.d.Library_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
