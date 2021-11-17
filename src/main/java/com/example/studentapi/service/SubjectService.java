package com.example.studentapi.service;

import com.example.studentapi.entity.Category;
import com.example.studentapi.entity.Subject;
import com.example.studentapi.respository.SubjectRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRespository subjectRespository;

    public List<Subject> findAll() {
        return (List<Subject>) subjectRespository.findAll();
    }
    public Optional<Subject> findById(Integer id) {
        return subjectRespository.findById(id);
    }

    public Optional<Subject> getSubjectById(Integer id) {
        return subjectRespository.findById(id);
    }
    public void addSubject(Subject subject){
        subjectRespository.save(subject);

    }

    public void updateSubject(Subject subject) {
        subjectRespository.save(subject);
    }


    public void deleteSubject(Integer id) {
        subjectRespository.deleteById(id);
    }
}
