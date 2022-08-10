package com.example.tasktracker.Controllers;

import com.example.tasktracker.Model.ApiRespons;
import com.example.tasktracker.Model.Tasks;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TasksController {
    ArrayList<Tasks> tasks = new ArrayList<>();

    @GetMapping("/task/display")
    public ArrayList<Tasks> displayTasks() {
        return tasks;
    }

    @PostMapping("/task/add")
    public ApiRespons addTask(@RequestBody Tasks task) {
        tasks.add(task);
        return new ApiRespons("Add Task");
    }

    @PutMapping("/task/update/{index}")
    public ApiRespons updateTask(@RequestBody Tasks task, @PathVariable int index) {
        tasks.set(index, task);
        return new ApiRespons("Update Task");
    }

    @DeleteMapping("/task/delete/{index}")
    public ApiRespons deleteTask(@PathVariable int index) {
        tasks.remove(index);
        return new ApiRespons("Delete task");
    }

    @PostMapping("/task/change/{index}")
    public ApiRespons changeTaskStatus(@RequestBody String newStatus, @PathVariable int index) {
        tasks.get(index).setStatus(newStatus);
        return new ApiRespons("Change Task Status");
    }

    @GetMapping("/task/search")
    public Tasks searchTask(@RequestBody String title) {
        for (Tasks task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }
}
