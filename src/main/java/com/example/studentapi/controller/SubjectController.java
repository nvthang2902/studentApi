package com.example.studentapi.controller;


import com.example.studentapi.entity.Category;
import com.example.studentapi.entity.Subject;
import com.example.studentapi.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subject")
    public List<Subject> getAllSubjects(){
        return subjectService.findAll();
    }

    @GetMapping("/subject/{id}")
    public Optional<Subject> getSubjectById(@PathVariable Integer id){
        return subjectService.findById(id);
    }

    @GetMapping("/subject/{id}/categories")
    public List<Category> getSubjectByCate(@PathVariable Integer id){
        Optional<Subject> subject=subjectService.getSubjectById(id);
        if(subject.isPresent()){
            return subject.get().getCategories();
        }
        return null;
    }
    @PostMapping("/subject/add")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }
    @PutMapping("/subject/{id}/update")
    public void updateSubject(@RequestBody Subject subject){
        subjectService.updateSubject(subject);
    }

    @DeleteMapping("/subject/{id}/delete")
    public void deleteSubject(@PathVariable Integer id)
    {
        subjectService.deleteSubject(id);
    }
}
