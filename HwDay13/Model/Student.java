package com.example.javaday12.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Student {
    @NotEmpty
    @Id
    private String ID;
    @NotEmpty
    private String name;
    @NotNull
    private int age;
    @NotEmpty
//    @Column(columnDefinition = "ch")
    private String major;
    //------------------------------------------------------------
//    private ArrayList<Classes> classList;
//    private String advisorName;

//    public Student(String ID, String name, int age, ArrayList<Classes> classList, String advisorName, String major) {
//        this.ID = ID;
//        this.name = name;
//        this.age = age;
//        this.classList = new ArrayList<>();
//        this.advisorName = advisorName;
//        this.major = major;
//    }
}
