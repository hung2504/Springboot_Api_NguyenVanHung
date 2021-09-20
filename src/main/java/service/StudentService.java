package service;

import entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface StudentService {
    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
}
