package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudentById(Long studentId, Student student) {
        Student student1 = studentRepository.findById(studentId).get();
        if(Objects.nonNull(student.getFirstName()) &&
                !"".equalsIgnoreCase(student.getFirstName()));
        return studentRepository.save(student1);
    }
}
