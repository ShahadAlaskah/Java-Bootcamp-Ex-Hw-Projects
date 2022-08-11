package com.example.javaday10.Controller;

import com.example.javaday10.Model.ApiResponse;
import com.example.javaday10.Model.Employees;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/employee")
public class AuthController {

    ArrayList<Employees> employees=new ArrayList<>();

    @GetMapping
    public ResponseEntity getEmployee(){
        return ResponseEntity.status(200).body(employees);
    }



    @PostMapping
    public ResponseEntity addEmployee(@RequestBody @Valid Employees employee, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        employees.add(employee);
        return ResponseEntity.status(200).body(new ApiResponse("add",200));
    }

    @PutMapping("/{index}")
    public ResponseEntity updateEmployee(@RequestBody @Valid Employees employee,@PathVariable Integer index, Errors errors){
        if (errors.hasErrors()) {
            String massage=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage,400));
        }
        employees.set((int)index,employee);
        return ResponseEntity.status(200).body(new ApiResponse("update",200));
    }

    @DeleteMapping("/{index}")
    public ResponseEntity deleteEmployees(@PathVariable Integer index){
        if (index >= employees.size()) {
            return ResponseEntity.status(400).body(new ApiResponse("enter valid index",400));
        }
        employees.remove((int)index);
        return ResponseEntity.status(200).body("delete");
    }

    @PostMapping("/{index}")
    public ResponseEntity annualLeave(@PathVariable Integer index){
        Employees employee =employees.get((int)index);
        if (employee.getAnnualLeave() < 1 || employee.getOnLeave()) {
            return ResponseEntity.status(200).body(new ApiResponse("!!!!!!!!!!",400));
        }
        employee.setAnnualLeave(employee.getAnnualLeave()-1);
        employee.setOnLeave(true);
        return ResponseEntity.status(200).body(new ApiResponse("getAnnualLeave",200));
    }

}
