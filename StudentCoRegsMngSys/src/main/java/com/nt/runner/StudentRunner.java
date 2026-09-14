package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.IController;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private IController controller;

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search By Id");
            System.out.println("4. Update Course");
            System.out.println("5. Delete Student");
            System.out.println("6. Count Students");
            System.out.println("7. Exit");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                controller.registerStudent();
                break;

            case 2:
                controller.getAllStudents();
                break;

            case 3:
                controller.getStudentById();
                break;

            case 4:
                controller.updateCourse();
                break;

            case 5:
                controller.deleteStudent();
                break;

            case 6:
                controller.countStudents();
                break;

            case 7:
                System.out.println("Application Closed...");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}