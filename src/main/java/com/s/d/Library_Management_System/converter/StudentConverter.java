package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.enums.BloodGroup;
import com.s.d.Library_Management_System.enums.Department;
import com.s.d.Library_Management_System.enums.Gender;
import com.s.d.Library_Management_System.enums.Semester;
import com.s.d.Library_Management_System.model.Student;
import com.s.d.Library_Management_System.requestdto.AddressDto;
import com.s.d.Library_Management_System.requestdto.StudentDto;

import java.time.LocalDate;

public class StudentConverter {
    public static Student studentConverter(StudentDto studentDto){
        Student student = new Student();

        student.setName(studentDto.getName());
        student.setMobileNo(studentDto.getMobileNo());
        student.setEmail(studentDto.getEmail());
        student.setBloodGroup(studentDto.getBloodGroup());
        student.setDepartment(studentDto.getDepartment());
        student.setSemester(studentDto.getSemester());
        student.setDob(studentDto.getDob());
        student.setGender(studentDto.getGender());
        student.setSection(studentDto.getSection());
//              Address will set in service classes



        return student;
    }
}
