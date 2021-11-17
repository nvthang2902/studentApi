package com.example.studentapi.respository;

import com.example.studentapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRespository extends JpaRepository<Student,Integer> {
    List<Student> findByCategoryId(Integer id);
}
