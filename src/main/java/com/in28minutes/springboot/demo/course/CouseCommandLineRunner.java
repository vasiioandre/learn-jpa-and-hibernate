package com.in28minutes.springboot.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.demo.course.jpa.CourseJpaRepository;

@Component
public class CouseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn Java", "in28minutes"));
		repository.insert(new Course(2, "Learn AWS", "in28minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}

}
