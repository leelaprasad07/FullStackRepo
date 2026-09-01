package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Student;
import com.nt.service.IStudentMgnmtService;

@Controller
public class StudentOperationsController {

    @Autowired
    private IStudentMgnmtService stuService;
    // HOME
    @GetMapping("/")
    public String showHome() {
        return "home";
    }
     // SHOW REGISTRATION FORM
    @GetMapping("/stu_add")
    public String showStudentForm(
            @ModelAttribute("stu") Student stu) {

        return "student_register";
    }
    // INSERT / CREATE
    @PostMapping("/stu_register")
    public String registerStudent(
            @ModelAttribute("stu") Student stu,
            RedirectAttributes attrs) {

        Student savedStu =
                stuService.registerStudent(stu);

        attrs.addFlashAttribute(
                "resultMsg",
                "Student registered successfully with ID : "
                + savedStu.getStuId());

        return "redirect:/stu_report";
    }
    // READ ALL
    @GetMapping("/stu_report")
    public String showStudentReport(
            @ModelAttribute("stu") Student stu,
            Map<String, Object> map) {

        Iterable<Student> itStu =
                stuService.getAllStudents();

        map.put("stuList", itStu);

        return "show_student_report";
    }
    
    @GetMapping("/stu_edit")
    public String showEditForm(
            @RequestParam("id") Integer id,
            Map<String, Object> map) {

        Student stu =
                stuService.getStudentById(id);
        map.put("stu", stu);
        return "student_edit";
    }
    // UPDATE
    @PostMapping("/stu_update")
    public String updateStudent(
            @ModelAttribute("stu") Student stu,
            RedirectAttributes attrs) {

        Student updatedStu =
                stuService.updateStudent(stu);

        attrs.addFlashAttribute(
                "resultMsg",
                "Student updated successfully with ID : "
                + updatedStu.getStuId());

        return "redirect:/stu_report";
    }
    // DELETE
    @GetMapping("/stu_delete")
    public String deleteStudent(
            @RequestParam("id") Integer id,
            RedirectAttributes attrs) {
    	
        stuService.deleteStudent(id);
        
        attrs.addFlashAttribute(
                "resultMsg",
                "Student deleted successfully");
        
        return "redirect:/stu_report";
    }
}