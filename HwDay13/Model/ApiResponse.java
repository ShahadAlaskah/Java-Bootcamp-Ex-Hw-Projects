package com.example.javaday12.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiResponse {
    private String massage;
    private int status;
}
