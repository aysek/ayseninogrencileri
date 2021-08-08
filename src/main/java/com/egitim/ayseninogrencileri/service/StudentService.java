package com.egitim.ayseninogrencileri.service;

import com.egitim.ayseninogrencileri.model.Student;
import com.egitim.ayseninogrencileri.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
@Component
public class StudentService {
    private final StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(Integer id) {
        return repository.getStudentById(id);
    }


    public List<Student> getAllStudents() {
        return (List<Student>) repository.findAll();
    }


    public Student updateStudent(Integer id, Student student) {
        Student savedStudent = repository.getStudentById(id);

        if (savedStudent == null) throw new RuntimeException("User not found");

        student.setId(id);

        return repository.save(student);
    }


    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }


}
