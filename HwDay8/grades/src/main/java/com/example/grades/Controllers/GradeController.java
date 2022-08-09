package com.example.grades.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

    @RestController
    public class GradeController {
        ArrayList<String> grades=new ArrayList<>();

        @GetMapping("/grade")
        public ArrayList<String> getGrades(){
            return grades;
        }
        @PostMapping("/grade")
        public String addGrades(@RequestBody String grade){
            grades.add(grade);
            return "name added";
        }
        @DeleteMapping("/grade/{index}")
        public String deleteGrades(@PathVariable int index){
            grades.remove(index);
            return "name deleted";
        }
        @PutMapping("/grade/{index}")
        public String updateGrades(@RequestBody String grade,@PathVariable int index){
            grades.set(index,grade);
            return "name updated";
        }
    }


