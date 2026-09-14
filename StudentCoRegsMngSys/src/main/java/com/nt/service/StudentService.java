package com.nt.service;

import java.util.Optional;

import com.nt.sbeans.Student;

public interface StudentService 
{
	void registerStudent(Student student);
	Iterable<Student> getAllStudents();
	Optional<Student> getStudentById(Integer id);
	void updateCourse(Integer id, String courseName, Double courseFee);
	void deleteStudent(Integer id);
	long countStudents();
}
