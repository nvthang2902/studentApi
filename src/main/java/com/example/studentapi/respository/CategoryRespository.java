package com.example.studentapi.respository;

import com.example.studentapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRespository extends JpaRepository<Category,Integer> {

//    List<Category> findByStudentId(Integer id);
}
