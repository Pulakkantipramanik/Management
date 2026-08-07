package com.studentmanagement.controller;
import com.studentmanagement.entity.Student;
import com.studentmanagement.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/students")
public class StudentController {

    public final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    //delete data
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable  Long id){
        studentService.deleteStudentById(id);
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

}
