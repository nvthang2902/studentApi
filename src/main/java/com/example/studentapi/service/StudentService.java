package com.example.studentapi.service;

import com.example.studentapi.entity.Student;
import com.example.studentapi.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRespository studentRespository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRespository.findAll();
    }


    public Optional<Student> getStudentById(Integer id) {
        return studentRespository.findById(id);
    }

    public List<Student> getStudentByCategory(Integer id) {
        return studentRespository.findByCategoryId(id);
    }
    public void addStudent(Student student){
        studentRespository.save(student);
    }

    public void updateStudent(Student student) {
        studentRespository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRespository.deleteById(id);
    }
}
