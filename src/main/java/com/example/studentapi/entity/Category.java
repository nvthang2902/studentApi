package com.example.studentapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private Set<Student> studentSet=new HashSet<>();
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Student> students;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subjectid",insertable = false,updatable = false)
    private Subject subject;

    private Integer subjectid;


}
