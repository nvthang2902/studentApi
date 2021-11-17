package com.example.studentapi.respository;

import com.example.studentapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRespository extends JpaRepository<Subject,Integer> {
}
