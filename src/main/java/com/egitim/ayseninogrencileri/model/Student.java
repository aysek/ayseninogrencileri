package com.egitim.ayseninogrencileri.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;


@Entity //veri tabanında tutulacak bir tip olacağı için
@Data
@Builder
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private   Integer id;
    private   String studentName;
    private   String studentSurname;


    @JsonManagedReference
    @OneToMany(mappedBy = "student")
    private List<Lesson> lessonsOfStudent;

    public Student(Integer id, String studentName, String studentSurname, List<Lesson> lessonsOfStudent) {
        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.lessonsOfStudent = lessonsOfStudent;
    }

/*
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Lesson student;
     */

}
