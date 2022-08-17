package com.example.javaday12.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
public class addClassesToClassList {
//    student id and class id
    @NotEmpty
    private String userID;
    @NotEmpty
    private String classID;

}
