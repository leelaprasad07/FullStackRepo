package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repo.IStudentRepository;

@Service
public class StudentMgnmtServiceImpl
        implements IStudentMgnmtService {

    @Autowired
    private IStudentRepository stuRepo;

    @Override
    public Student registerStudent(Student stu) {

        return stuRepo.save(stu);
    }

    @Override
    public Iterable<Student> getAllStudents() {

        return stuRepo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {

        return stuRepo.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Student stu) {

        return stuRepo.save(stu);
    }

    @Override
    public void deleteStudent(Integer id) {

        stuRepo.deleteById(id);
    }
}