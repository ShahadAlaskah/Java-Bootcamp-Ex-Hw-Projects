package com.example.javaday12.Advise;

import com.example.javaday12.Exceptions.ApiException;
import com.example.javaday12.Exceptions.TeacherNotFoundExceptions;
import com.example.javaday12.Model.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvise {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException){
        String message=methodArgumentNotValidException.getFieldError().getDefaultMessage();
        return ResponseEntity.status(400).body(new ApiResponse(message,400));
    }

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<ApiResponse> apiException(ApiException apiException){
        String message=apiException.getMessage();
        return ResponseEntity.status(400).body(new ApiResponse(message,400));
    }

    @ExceptionHandler(value = TeacherNotFoundExceptions.class)
    public ResponseEntity<ApiResponse> teacherNotFoundExceptions(TeacherNotFoundExceptions teacherNotFoundExceptions){
        String message=teacherNotFoundExceptions.getMessage();
        return ResponseEntity.status(400).body(new ApiResponse(message,400));
    }

}
