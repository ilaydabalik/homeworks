package edu.sabanci.ilaydabalikhomework4.service;

import edu.sabanci.ilaydabalikhomework4.model.Student;
import edu.sabanci.ilaydabalikhomework4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addNewStudent(Student student){
        if (student.getName().length() > 100){
            throw new IllegalArgumentException("The student name can not be longer than 100 characters");
        }
      return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    public Optional<Student> getSpecificId(){
        return studentRepository.findById(getSpecificId().getId());
    }

    public Student updateExistingStudentList(Student student) {

        return studentRepository.save(student);
    }


    public Student deleteGivenStudent(Student student) {

        studentRepository.delete(student);
    }
}
