package edu.sabanci.ilaydabalikhomework4.repository;

import edu.sabanci.ilaydabalikhomework4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



}
