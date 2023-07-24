package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Course not found"));
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Course existingCourse = getCourseById(id);
        existingCourse.setTitle(updatedCourse.getTitle());
        existingCourse.setDescription(updatedCourse.getDescription());
        existingCourse.setDuration(updatedCourse.getDuration());
        existingCourse.setStudentList(updatedCourse.getStudentList());
        return courseRepository.save(existingCourse);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}