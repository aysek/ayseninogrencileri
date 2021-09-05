package com.egitim.ayseninogrencileri.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity //veri tabanında tutulacak bir tip olacağı için
@Data
@Builder
@NoArgsConstructor

public class Lesson  {
        //JPA entitiyleri Serializable interface geliyor
        @Id
        @GeneratedValue
        private Integer id;
        private String lessonName;

        @JsonBackReference
        @ManyToOne
        @JoinColumn(name = "student_id")
        private Student student;

        /*
        @OneToMany(mappedBy = "lesson")
        private List <Student> studentsOfLesson;
        */

        public Lesson(Integer id, String lessonName, Student student) {
                this.id = id;
                this.lessonName = lessonName;
                this.student = student;
        }
}
