package com.dev.james.practicespringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course/api/v1/")
public class CourseController {


    @GetMapping("")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","James"),
                new Course(2,"Learn Azure","Godwill"),
                new Course(3,"Learn GCP","Arkoh"),
                new Course(4,"Spring boot","Juniors"),
                new Course(5,"Microservice","Kobina")

        );
    }




}
