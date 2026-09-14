package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.sbeans.Student;
import com.nt.sbeans.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository stuRepo;

	@Override
	public void registerStudent(Student student) 
	{
		stuRepo.save(student);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Student> getAllStudents() 
	{
		return stuRepo.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Integer id)
	{
		return stuRepo.findById(id);
	}

	public void updateCourse(Integer id, String courseName, Double courseFee) 
	{
		Optional<Student> opt=stuRepo.findById(id);
		
		if(opt.isPresent())
		{
			Student student=opt.get();
			student.setCourse(courseName);
			
			student.setFee(courseFee);
			
			stuRepo.save(student);
			System.out.println("Course updated Successfully!");
		}
		else
		{
			System.out.println("Student not Found");
		}
		
	}
	@Override
	public void deleteStudent(Integer id)
	{
		if(stuRepo.existsById(id))
		{
			stuRepo.deleteById(id);
			
			System.out.println("Student Deleted Successfully");
		}else
		{
			System.out.println("Student Not Found");
		}
		
	}
	@Override
	public long countStudents()
	{
		return stuRepo.count();
		
	}

}
