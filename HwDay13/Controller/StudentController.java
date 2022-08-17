package com.example.javaday12.Controller;

import com.example.javaday12.Model.*;
import com.example.javaday12.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudent(){
        List<Student> studentArrayList=studentService.getStudent();
        return ResponseEntity.status(200).body(studentArrayList);
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody @Valid Student student, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        studentService.addStudent(student);
        return ResponseEntity.status(200).body(new ApiResponse("New student added !",200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody @Valid Student student,@PathVariable String id, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        studentService.updateStudent(id,student);
        return ResponseEntity.status(200).body(new ApiResponse("update student !",200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
        return ResponseEntity.status(200).body(new ApiResponse("delete student !",200));
    }
    @GetMapping("/studentById/{id}")
    public ResponseEntity<Student> studentById(@PathVariable String id){
        Student student=studentService.studentById(id);
        return ResponseEntity.status(200).body(student);
    }

    @GetMapping("/studentsUnderMajor")
    public ResponseEntity<List<Student>> studentsUnderMajor(@RequestParam String major){
        List<Student> studentList=studentService.studentsUnderMajor(major);
        return ResponseEntity.status(200).body(studentList);
    }
    @GetMapping("/findAllByAgeGreaterThanEqual")
    public ResponseEntity<List<Student>> findAllByAgeGreaterThanEqual(@RequestParam Integer age){
        List<Student> studentList=studentService.findAllByAgeGreaterThanEqual(age);
        return ResponseEntity.status(200).body(studentList);
    }

//    @PostMapping("/addClassesToClassList")
//    public ResponseEntity<?> addClassesToClassList(@RequestBody @Valid addClassesToClassList addClassesToClassList, Errors errors){
//        if (errors.hasErrors()) {
//            String massage=errors.getFieldError().getDefaultMessage();
//            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
//        }
//        studentService.addClassesToClassList(addClassesToClassList);
//        return ResponseEntity.status(200).body(new ApiResponse("addClassesToClassList !",200));
//    }

//    @PutMapping("/changeStudentMajor")
//    public ResponseEntity<?> changeStudentMajor(@RequestBody @Valid changeStudentMajor changeStudentMajor, Errors errors){
//        if (errors.hasErrors()) {
//            String massage=errors.getFieldError().getDefaultMessage();
//            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
//        }
//        studentService.changeStudentMajor(changeStudentMajor);
//        return ResponseEntity.status(200).body(new ApiResponse("changeStudentMajor !",200));
//    }



}
