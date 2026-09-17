package com.nt;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.repository.EmployeeRepository;
import com.nt.sbeans.Employee;
import com.nt.service.IEmployeeService;

@SpringBootApplication
public class EmployeeMngSysPagingandSortingRepos1Application implements CommandLineRunner 
        {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private IEmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(
                EmployeeMngSysPagingandSortingRepos1Application.class,
                args);
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        repo.save(new Employee(101, "Rahul", "IT", 45000.0));
        repo.save(new Employee(102, "Priya", "HR", 40000.0));
        repo.save(new Employee(103, "Amit", "Finance", 50000.0));
        repo.save(new Employee(104, "Neha", "Testing", 42000.0));
        repo.save(new Employee(105, "Arjun", "IT", 55000.0));
        repo.save(new Employee(106, "Kavya", "HR", 47000.0));
        repo.save(new Employee(107, "Ravi", "IT", 52000.0));
        repo.save(new Employee(108, "Sneha", "Finance", 46000.0));
        repo.save(new Employee(109, "Kiran", "Testing", 43000.0));
        repo.save(new Employee(110, "Meena", "HR", 41000.0));

        System.out.println("1. Page 1 Size 3");
        System.out.println("2. Page 2 Size 3");
        System.out.println("3. Sort By Salary");
        System.out.println("4. Sort By Name");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            System.out.println("\n=== PAGE 1 SIZE 3 ===");
            service.getEmployeesByPage(0, 3)
                   .forEach(System.out::println);
            break;

        case 2:
            System.out.println("\n=== PAGE 2 SIZE 3 ===");
            service.getEmployeesByPage(1, 3)
                   .forEach(System.out::println);
            break;

        case 3:
            System.out.println("\n=== SORT BY SALARY ===");
            service.getEmployeeSortedBySal()
                   .forEach(emp ->
                   System.out.println(
                   emp.getEmployeeName()
                   + " " + emp.getSalary()));
            break;

        case 4:
            System.out.println("\n=== SORT BY NAME ===");
            service.getEmployeeSortedByName()
                   .forEach(emp ->
                   System.out.println(
                   emp.getEmployeeName()));
            break;

        default:
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}