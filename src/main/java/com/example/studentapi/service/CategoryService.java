package com.example.studentapi.service;


import com.example.studentapi.entity.Category;
import com.example.studentapi.respository.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRespository categoryRespository;

    public List<Category> findAll() {
        return (List<Category>) categoryRespository.findAll();
    }

    public Optional<Category> findById(Integer id) {
        return categoryRespository.findById(id);
    }

    public void addCategory(Category category) {
        categoryRespository.save(category);
    }

    public void updateCategory(Category category) {
        categoryRespository.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRespository.deleteById(id);
    }

//    public List<Category> getCategoryByStudent(Integer id) {
//        return categoryRespository.findByStudentId(id);
//    }
}
