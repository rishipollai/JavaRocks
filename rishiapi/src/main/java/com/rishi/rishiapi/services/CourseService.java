package com.rishi.rishiapi.services;

import com.rishi.rishiapi.entity.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getSingeCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long Id);
}
