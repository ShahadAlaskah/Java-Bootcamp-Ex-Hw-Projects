package com.example.javaday12.Service;

import com.example.javaday12.Exceptions.ApiException;
import com.example.javaday12.Model.*;
import com.example.javaday12.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    //ArrayList<Student> studentArrayList=new ArrayList<>();
    private final StudentRepository studentRepository;
   // private final ClassesService classesService;
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(String id, Student student) {
        if (student == null) {
            throw new ApiException("student not found!!");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        Student student=studentRepository.getById(id);
        if (student == null) {
            throw new ApiException("student not found!!");
        }
        studentRepository.deleteById(id);
    }

    public Student studentById(String id) {
        Student student=studentRepository.getById(id);
        if (student == null) {
            throw new ApiException("student not found!!");
        }
        return student;

    }

    public List<Student> studentsUnderMajor(String major) {

        List<Student> studentList=studentRepository.findAllByMajor(major);
        if (studentList == null) {
            throw new ApiException("major not found!!");
        }
        return studentList;

    }

    public List<Student> findAllByAgeGreaterThanEqual(Integer age) {
        List<Student> studentList=studentRepository.findAllByAgeGreaterThanEqual(age);
        if (studentList == null) {
            throw new ApiException("age not found!!");
        }
        return studentList;
    }

//    public void addClassesToClassList(addClassesToClassList addClassesToClassList) {
//        ArrayList<Classes> classesArrayList=classesService.getClasses();
//        for (int i = 0; i < classesArrayList.size(); i++) {
//            Classes classes=classesArrayList.get(i);
//            if (addClassesToClassList.getClassID().equals(classes.getID())) {
//                for (int j = 0; j < studentArrayList.size(); j++) {
//                    Student student=studentArrayList.get(j);
//                    if (addClassesToClassList.getUserID().equals(student.getID())) {
//                        ArrayList<Classes> newClassList=student.getClassList();
//                        newClassList.add(classes);
//                        student.setClassList(newClassList);
//                    }else {
//                        throw new ApiException("Student Not Found !!");
//                    }
//
//                }
//
//            }else {
//                throw new ApiException("Class Not Found !!");
//            }
//
//        }
//    }

//    public void changeStudentMajor(changeStudentMajor changeStudentMajor) {
//        for (int j = 0; j < studentArrayList.size(); j++) {
//            Student student=studentArrayList.get(j);
//            if (changeStudentMajor.getStudentID().equals(student.getID())) {
//                student.setMajor(changeStudentMajor.getMajor());
//                student.setClassList(new ArrayList<>());
//            }else {
//                throw new ApiException("Student Not Found !!");
//            }
//
//        }
//
//    }
//    public ArrayList<Student> searchStudentList(String classID) {
//        ArrayList<Student>studentArrayList1=new ArrayList<>();
//        for (int i = 0; i < studentArrayList.size(); i++) {
//            Student student=studentArrayList.get(i);
//            for (int j = 0; j < student.getClassList().size(); j++) {
//                Classes classes=student.getClassList().get(j);
//                if (classes.getID().equals(classID)){
//                    studentArrayList1.add(student);
//                }
//            }
//        }
//        return studentArrayList1;
//    }
}
