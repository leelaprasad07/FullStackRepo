package com.nt.service;

import com.nt.model.Student;

public interface IStudentMgnmtService {

    public Student registerStudent(Student stu);

    public Iterable<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public Student updateStudent(Student stu);

    public void deleteStudent(Integer id);
}