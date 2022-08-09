package com.example.person.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {
    ArrayList<String> names=new ArrayList<>();

    @GetMapping("/name")
    public ArrayList<String> getNames(){
        return names;
    }
    @PostMapping("/name")
    public String addNames(@RequestBody String newName){
        names.add(newName);
        return "name added";
    }
    @DeleteMapping("/name/{index}")
    public String deleteNames(@PathVariable int index){
        names.remove(index);
        return "name deleted";
    }
    @PutMapping("/name/{index}")
    public String updateNames(@RequestBody String newName,@PathVariable int index){
        names.set(index,newName);
        return "name updated";
    }
}
