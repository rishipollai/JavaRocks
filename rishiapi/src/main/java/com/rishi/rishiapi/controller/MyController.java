package com.rishi.rishiapi.controller;


import com.rishi.rishiapi.entity.Course;
import com.rishi.rishiapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    //home page
    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    //get single course
    @GetMapping("/courses/{courseId}")
    public Course getSingleCourse(@PathVariable String courseId){
        return this.courseService.getSingeCourse(Long.parseLong(courseId));
    }

    //post course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }

    //update course using put
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    //delete course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
       try{
           this.courseService.deleteCourse(Long.parseLong(courseId));
           return new ResponseEntity<>(HttpStatus.OK);
       } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
