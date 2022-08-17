package com.example.javaday12.Repository;

import com.example.javaday12.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,String> {
    List<Teacher> findAllBySalaryGreaterThanEqual(Float salary);
}
