package com.studentmanagement.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    public final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    private static final Logger logger =
            LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        logger.info("Fetching all students");
        long start = System.currentTimeMillis();
        List<Student> students = studentRepository.findAll();
        long end = System.currentTimeMillis();
        logger.info("Total students found : {}", students.size());
        logger.info("findAllStudents took: {}ms", end - start);
        return students;
    }
}
//
//    @Override
//    public List<Student> findAllStudents() {
//
//        long start = System.currentTimeMillis();
//
//        List<Student> students = studentRepository.findAll();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("findAllStudents() took : " + (end - start) + " ms");
//
//        return students;
//    }
//}

