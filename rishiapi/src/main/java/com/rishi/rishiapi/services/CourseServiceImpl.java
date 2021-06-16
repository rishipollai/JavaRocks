package com.rishi.rishiapi.services;

import com.rishi.rishiapi.dao.CourseDao;
import com.rishi.rishiapi.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

//    List<Course> list;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(123,"Java Core","This is core java course"));
//        list.add(new Course(125,"Spring Boot","This is spring boot course"));
    }

    @Override
    public List<Course> getCourses() {

        return  courseDao.findAll();

//        return list;
    }

    @Override
    public Course getSingeCourse(long courseId) {
//        Course c=null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
//
//        return c;

        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;

        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;

        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long Id) {
//        list=this.list.stream().filter(e->e.getId()!=Id).collect(Collectors.toList());

       Course entity=  courseDao.getById(Id);
       courseDao.delete(entity);
    }
}
