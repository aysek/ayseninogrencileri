package com.egitim.ayseninogrencileri.repository;

import com.egitim.ayseninogrencileri.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    Student getStudentById(Integer id);




}
