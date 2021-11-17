package com.example.studentapi.controller;


import com.example.studentapi.entity.Category;
import com.example.studentapi.entity.Student;
import com.example.studentapi.entity.Subject;
import com.example.studentapi.respository.CategoryRespository;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private CategoryRespository categoryRespository;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

//    @GetMapping("/student/{id}/categories")
//    public List<Category> getCateByStudent(@PathVariable Integer id){
//        Optional<Student> student=studentService.getStudentById(id);
//        if(student.isPresent()){
//            return (List<Category>) student.get().getCategory();
//        }
//        return null;
//    }

    @GetMapping("/students/category/{id}/students")
    public List<Student> getStudentsByCategory(@PathVariable Integer id){
        return studentService.getStudentByCategory(id);
    }

    @PostMapping("/students/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/students/{id}/update")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}/delete")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
