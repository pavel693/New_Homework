package com.baseapp.service;

import com.baseapp.model.Student;
import com.baseapp.repository.StudentRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("universityService")
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    StudentRepository studentRepository;

    public UniversityServiceImpl() {
    }

    public UniversityServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAvailableStudents() {
        return studentRepository.getStudents();
    }
}
