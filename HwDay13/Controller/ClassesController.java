//package com.example.javaday12.Controller;
//
//import com.example.javaday12.Model.ApiResponse;
//import com.example.javaday12.Model.Classes;
//import com.example.javaday12.Model.Student;
//import com.example.javaday12.Service.ClassesService;
//import com.example.javaday12.Service.StudentService;
//import com.example.javaday12.Service.TeacherService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.ArrayList;
//
//@RestController
//@RequestMapping("/api/v1/Classes")
//@AllArgsConstructor
//public class ClassesController {
//
//    private final ClassesService classesService;
//    private final TeacherService teacherService;
//    private final StudentService studentService;
//
//    @GetMapping
//    public ResponseEntity<?> getClasses(){
//        ArrayList<Classes> studentArrayList=classesService.getClasses();
//        return ResponseEntity.status(200).body(studentArrayList);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> addClasses(@RequestBody @Valid Classes classes){
//        classesService.addClasses(classes);
//        return ResponseEntity.status(200).body(new ApiResponse("New classes added !",200));
//    }
//
//    @PutMapping("/{index}")
//    public ResponseEntity<?> updateClasses(@RequestBody @Valid Classes classes, @PathVariable int index){
//        classesService.updateClasses(index,classes);
//        return ResponseEntity.status(200).body(new ApiResponse("update classes !",200));
//    }
//
//    @DeleteMapping("/{index}")
//    public ResponseEntity<?> deleteClasses(@PathVariable int index){
//        classesService.deleteClasses(index);
//        return ResponseEntity.status(200).body(new ApiResponse("delete classes !",200));
//    }
//    @GetMapping("/SearchTeacher/{classID}")
//    public ResponseEntity<?> searchTeacher(@PathVariable String classID){
//        return ResponseEntity.status(200).body(teacherService.SearchTeacher(classID));
//    }
//
//    @GetMapping("/searchStudentList/{classID}")
//    public ResponseEntity<?> searchStudentList(@PathVariable String classID){
//        return ResponseEntity.status(200).body(studentService.searchStudentList(classID));
//    }
//
//
//}
