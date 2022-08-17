package com.example.javaday12.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
public class changeStudentMajor {
    @NotEmpty
    private String studentID;

    @NotEmpty
    private String major;
}
