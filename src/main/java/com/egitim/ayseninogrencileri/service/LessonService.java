package com.egitim.ayseninogrencileri.service;

import com.egitim.ayseninogrencileri.model.Lesson;
import com.egitim.ayseninogrencileri.model.Student;
import com.egitim.ayseninogrencileri.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Component
public class LessonService {
    private final LessonRepository repository;

    public Lesson save(Lesson lesson){
        return repository.save(lesson);
    }
    public List<Lesson> getAllLesson(){
        return (List<Lesson>) repository.findAll();
    }

}
