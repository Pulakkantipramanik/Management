package com.studentmanagement.service;

import com.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

     Student saveStudent(Student student);
     void deleteStudentById(Long id);
     Student findStudentById(Long id);
     Student updateStudent(Student student);
     List<Student> findAllStudents();
     void deleteAllStudents();

}
