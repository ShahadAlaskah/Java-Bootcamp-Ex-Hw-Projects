package com.example.javaday12.Repository;

import com.example.javaday12.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> findAllByMajor(String major);
    List<Student> findAllByAgeGreaterThanEqual(Integer age);

}
