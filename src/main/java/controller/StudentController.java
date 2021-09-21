package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public Student saveStudents(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudentById(@PathVariable("id") Long studentId,
                                     @RequestBody Student student){
        return studentService.updateStudentById(studentId,student);
    }
}
