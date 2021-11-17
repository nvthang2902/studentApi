package com.example.studentapi.controller;

import com.example.studentapi.entity.Category;
import com.example.studentapi.entity.Student;
import com.example.studentapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }
    @GetMapping("/categories/{id}")
    public Optional<Category> getCategoryById(@PathVariable Integer id){
        return categoryService.findById(id);
    }

    @GetMapping("/category/{id}/students")
    public List<Student> getStudentsByCate(@PathVariable Integer id){
        Optional<Category> category= categoryService.findById(id);

        if(category.isPresent()){
            Category newCategory= category.get();
            return newCategory.getStudents();
        }
        return null;
    }

//    @GetMapping("/categories/student/{id}/categories")
//    public List<Category> getCategoryByStudent(@PathVariable Integer id){
//        return categoryService.getCategoryByStudent(id);
//    }
    @PostMapping("/categories/add")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @PutMapping("/categories/{id}/update")
    public void updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
    }

    @DeleteMapping("/categories/{id}/delete")
    public void deleteCategory(@PathVariable Integer id){
        categoryService.deleteCategory(id);
    }
}
