package com.example.tasktracker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class Tasks {
    private String title;
    private String description;
    private String status;
    private String deadline;


}
