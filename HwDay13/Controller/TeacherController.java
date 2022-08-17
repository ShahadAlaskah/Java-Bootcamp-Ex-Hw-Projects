package com.example.javaday12.Controller;

import com.example.javaday12.Model.*;
//import com.example.javaday12.Service.ClassesService;
import com.example.javaday12.Service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Teacher")
@AllArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> getTeacher(){
        List<Teacher> studentArrayList=teacherService.getTeacher();
        return ResponseEntity.status(200).body(studentArrayList);
    }

    @PostMapping
    public ResponseEntity<?> addTeacher(@RequestBody @Valid Teacher teacher, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        teacherService.addTeacher(teacher);
        return ResponseEntity.status(200).body(new ApiResponse("New teacher added !",200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updateTeacher(@RequestBody @Valid Teacher teacher, @PathVariable String id, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        teacherService.updateTeacher(id,teacher);
        return ResponseEntity.status(200).body(new ApiResponse("update teacher !",200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteTeacher(@PathVariable String id){
        teacherService.deleteTeacher(id);
        return ResponseEntity.status(200).body(new ApiResponse("delete teacher !",200));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Teacher> teacherById(@PathVariable String id){
        Teacher teacher=teacherService.teacherById(id);
        return ResponseEntity.status(200).body(teacher);
    }
    @GetMapping("/findAllBySalaryGreaterThanEqual")
    public ResponseEntity<List<Teacher>> findAllBySalaryGreaterThanEqual(@RequestParam Float salary){
        List<Teacher> teacherList=teacherService.findAllBySalaryGreaterThanEqual(salary);
        return ResponseEntity.status(200).body(teacherList);
    }

//    @PostMapping("/addClassesToClassList")
//    public ResponseEntity<?> addClassesToClassList(@RequestBody @Valid addClassesToClassList addClassesToClassList, Errors errors){
//        if (errors.hasErrors()) {
//            String massage=errors.getFieldError().getDefaultMessage();
//            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
//        }
//        teacherService.addClassesToClassList(addClassesToClassList);
//        return ResponseEntity.status(200).body(new ApiResponse("New classes added !",200));
//    }

}
