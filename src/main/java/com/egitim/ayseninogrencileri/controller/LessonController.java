package com.egitim.ayseninogrencileri.controller;


import com.egitim.ayseninogrencileri.model.Lesson;
import com.egitim.ayseninogrencileri.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/lessons")
public class LessonController {

    private final LessonService lessonService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Lesson saveLesson (@RequestBody Lesson lesson) {

        return lessonService.save(lesson);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Lesson> getAll(){
        return lessonService.getAllLesson();
    }

}
