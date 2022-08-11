package com.example.javaday10.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class ApiResponse {
    private String massage;
    private Integer error;
}
