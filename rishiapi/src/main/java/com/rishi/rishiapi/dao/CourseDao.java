package com.rishi.rishiapi.dao;

import com.rishi.rishiapi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
