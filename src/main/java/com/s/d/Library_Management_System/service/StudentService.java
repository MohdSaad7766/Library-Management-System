package com.s.d.Library_Management_System.service;

import com.s.d.Library_Management_System.converter.AddressConverter;
import com.s.d.Library_Management_System.converter.StudentConverter;
import com.s.d.Library_Management_System.enums.CardStatus;
import com.s.d.Library_Management_System.model.Address;
import com.s.d.Library_Management_System.model.Card;
import com.s.d.Library_Management_System.model.Student;
import com.s.d.Library_Management_System.repository.StudentRepository;
import com.s.d.Library_Management_System.requestdto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(StudentDto studentDto){
        Student student = StudentConverter.studentConverter(studentDto);

        Address address = AddressConverter.addressConverter(studentDto.getAddressDto());

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVE);


        student.setAddress(address);
        student.setCard(card);

        card.setStudent(student);


        studentRepository.save(student);
        return  student;
    }
}
