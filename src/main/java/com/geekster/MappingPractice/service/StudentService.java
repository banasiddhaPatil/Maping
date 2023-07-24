package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Student not found"));
    }

    public Student updateStudent(String id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
        existingStudent.setBranch(updatedStudent.getBranch());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setAddress(updatedStudent.getAddress());
        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}