package com.egitim.ayseninogrencileri.controller;


import com.egitim.ayseninogrencileri.model.Student;
import com.egitim.ayseninogrencileri.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;


    // POST - Yeni öğrenci oluşturur
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    // GET -  ID den öğrenci alır
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    // GET -  Bütün öğrencileri alır
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    // DELETE -  ID den öğrenci siler
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }


    // PUT - ID den öğrenci düzenler
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.updateStudent(id,student);
    }









}
