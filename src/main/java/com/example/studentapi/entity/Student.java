package com.example.studentapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String email;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id", nullable = false, insertable = false, updatable = false)
    private Category category;

    private Integer category_id;

}
