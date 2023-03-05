package edu.sabanci.ilaydabalikhomework4.controller;

import edu.sabanci.ilaydabalikhomework4.model.Student;
import edu.sabanci.ilaydabalikhomework4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){

       return studentService.addNewStudent(student);

    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students")
    public Optional<Student> getSpecificId(){
        return studentService.getSpecificId();
    }

    @PutMapping("/students")
    public Student updateStudentList(@RequestBody Student student){
        return studentService.updateExistingStudentList(student);
    }

    @DeleteMapping("/students")
    public void deleteGivenStudent(@RequestBody Student student){
         studentService.deleteGivenStudent(student);
    }



}
