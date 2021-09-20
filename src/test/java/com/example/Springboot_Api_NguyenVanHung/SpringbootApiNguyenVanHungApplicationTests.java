package com.example.Springboot_Api_NguyenVanHung;

import entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.StudentRepository;

import java.util.List;

@SpringBootTest
class SpringbootApiNguyenVanHungApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void findAllStudent(){
		List<Student> students = studentRepository.findAllStudent();
		System.out.println(students);
	}

}
