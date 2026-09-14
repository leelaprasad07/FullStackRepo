package com.nt.controller;

import com.nt.sbeans.Student;
import com.nt.sbeans.StudentRepository;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.service.StudentService;

@Controller
public class StudentController implements IController
{
	private final StudentRepository studentRepository;

	@Autowired
	private StudentService studentService;
	
	private Scanner sc=new Scanner(System.in);

	StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void registerStudent() 
	{
		System.out.println("Enter Student ID");
		Integer id=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		
		if(name.isBlank())
		{
			System.out.println("Student Name cannot be Empty");
			return;
		}
		System.out.println("Enter course Name");
		String course=sc.nextLine();
		
		System.out.println("Enter course fee");
		Double fee=sc.nextDouble();
		sc.nextLine();
		
		if(fee<=0)
		{
			System.out.println("Course Fee must be greater than 0");
            return;
		}
		 System.out.println("Enter Institute Name:");
	        String institute = sc.nextLine();

	        if (institute.isBlank()) {
	            System.out.println("Institute Name cannot be empty");
	            return;
	        }
	        
	        
	        
	        Student student = new Student(
	                id,
	                name,
	                course,
	                fee,
	                institute);

	        studentService.registerStudent(student);

	        System.out.println("Student Registered Successfully...");
	    }
	

	@Override
	public void getAllStudents() 
	{
		Iterable<Student> students = studentService.getAllStudents();

        students.forEach(System.out::println);
		
		
	}

	@Override
	public void getStudentById() 
	{
		System.out.println("Enter Student Id:");
        Integer id = sc.nextInt();

        Optional<Student> opt = studentService.getStudentById(id);

        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("Student Not Found...");
        }
    
		
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCourse() 
	{
		System.out.println("Enter Student Id:");
        Integer id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter New Course Name:");
        String course = sc.nextLine();

        System.out.println("Enter New Course Fee:");
        Double fee = sc.nextDouble();

        studentService.updateCourse(id, course, fee);
		
	}

	@Override
	public void deleteStudent()
	{
		 System.out.println("Enter Student Id:");
	        Integer id = sc.nextInt();

	        studentService.deleteStudent(id);
		
	}

	@Override
	public void countStudents()
	{
		 long count = studentService.countStudents();

	      System.out.println("Total Students : " + count);
		
	}

}
