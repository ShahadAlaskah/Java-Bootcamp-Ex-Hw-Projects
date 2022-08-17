package com.example.javaday12.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Teacher {
    @NotEmpty
    @Id
    private String ID;
    @NotEmpty
    private String name;
    @NotNull
    private Float salary;
    //---------------------------------------------------------
//    private ArrayList<Classes> classList;

//    public Teacher(String ID, String name, ArrayList<Classes> classList) {
//        this.ID = ID;
//        this.name = name;
//        this.classList = new ArrayList<>();
//    }
}
