package com.example.javaday12.Service;

import com.example.javaday12.Exceptions.ApiException;
import com.example.javaday12.Exceptions.TeacherNotFoundExceptions;
//import com.example.javaday12.Model.Classes;
import com.example.javaday12.Model.Student;
import com.example.javaday12.Model.Teacher;
import com.example.javaday12.Model.addClassesToClassList;
import com.example.javaday12.Repository.TeacherRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    //<Teacher> teacherArrayList=new ArrayList<>();
    private final TeacherRepository teacherRepository;
   // private final ClassesService classesService;
    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void updateTeacher(String id, Teacher teacher) {
        if (id == null) {
            throw new ApiException("teacher not found!!");
        }
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id) {
        if (id == null) {
            throw new ApiException("teacher not found!!");
        }
        teacherRepository.deleteById(id);
    }

    public Teacher teacherById(String id) {
        Teacher teacher=teacherRepository.getById(id);
        if (teacher == null) {
            throw new ApiException("teacher not found!!");
        }
        return teacher;

    }

    public List<Teacher> findAllBySalaryGreaterThanEqual(Float salary) {
        List<Teacher> teacherList=teacherRepository.findAllBySalaryGreaterThanEqual(salary);
        if (teacherList == null) {
            throw new ApiException("salary not found!!");
        }
        return teacherList;
    }

//    public void addClassesToClassList(addClassesToClassList addClassesToClassList) {
//        ArrayList<Classes> classesArrayList=classesService.getClasses();
//        for (int i = 0; i < classesArrayList.size(); i++) {
//            Classes classes=classesArrayList.get(i);
//            if (addClassesToClassList.getClassID().equals(classes.getID())) {
//                for (int j = 0; j < teacherArrayList.size(); j++) {
//                    Teacher teacher=teacherArrayList.get(j);
//                    if (addClassesToClassList.getUserID().equals(teacher.getID())) {
//                        teacher.getClassList().add(classes);
//                    }else {
//                        throw new ApiException("Teacher Not Found !!");
//                    }
//
//                }
//
//            }else {
//                throw new ApiException("Class Not Found !!");
//            }
//
//        }
//    }
//    public String SearchTeacher(String classID) {
//        for (int i = 0; i < teacherArrayList.size(); i++) {
//            Teacher teacher=teacherArrayList.get(i);
//            for (int j = 0; j < teacher.getClassList().size(); j++) {
//                Classes classes=teacher.getClassList().get(j);
//                if (classes.getID().equals(classID)){
//                    return teacher.getName();
//                }else {
//
//                    throw new TeacherNotFoundExceptions("Teacher Not Found !!");
//                }
//            }
//        }
//        return " ";
//    }


}
