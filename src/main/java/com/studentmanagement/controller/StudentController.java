package com.studentmanagement.controller;
import com.studentmanagement.entity.Student;
import com.studentmanagement.service.impl.StudentServiceImpl;
import jakarta.validation.Valid;
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


    // Created or submit data
    @PostMapping
    public Student saveStudent( @Valid @RequestBody Student student){
        return studentService.saveStudent(student);
    }

    //fetch data
    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    //update the data
    @PutMapping
    public Student updateStudent( @Valid @RequestBody Student student){
        return studentService.updateStudent(student);
    }

    //delete data
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable  Long id){
        studentService.deleteStudentById(id);
    }
    @DeleteMapping
    public void deleteStudentAll(){
        studentService.deleteAllStudents();
    }

    //get all data one time
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

}
