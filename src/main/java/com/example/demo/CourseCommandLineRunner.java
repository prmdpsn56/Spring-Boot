package com.example.demo;

import com.example.demo.JDBC.JdbcRepository;
import com.example.demo.JPA.JpaRepository;
import com.example.demo.Model.Course;
import com.example.demo.SpringJPA.SpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    JdbcRepository jdbcRepository;
    @Autowired
    private JpaRepository jpaRepository;

    @Autowired
    private SpringJpaRepository springJpaRepository;


    @Override
    public void run(String... args) throws Exception {
//        JDBC repository operations below
//        jdbcRepository.insert(new Course(7,"test","test1"));
//        jdbcRepository.insert(new Course(5,"test","test2"));
//        jdbcRepository.insert(new Course(6,"test","test3"));
//
//        jdbcRepository.delete(1);
//
//        System.out.println("-----RESPONSE FROM SQL DB------");
//        System.out.println(jdbcRepository.findById(7));


//        JPA repository operations below
//        jpaRepository.insert(new Course(1,"Test 1","Data from jpa"));
//        jpaRepository.insert(new Course(2,"Test 1","Data from jpa"));
//        jpaRepository.insert(new Course(3,"Test 1","Data from jpa"));
//        jpaRepository.deleteById(2);
//        System.out.println(jpaRepository.findById(3));

//        Spring JPA repository operations below
        springJpaRepository.save(new Course(1,"Test 1","Data from SpringJpa"));
        springJpaRepository.save(new Course(2,"Test 1","Data from SpringJpa"));
        springJpaRepository.save(new Course(3,"Test 1","Data from SpringJpa"));
        springJpaRepository.save(new Course(4,"Test 2","Data from SpringJpa"));
        springJpaRepository.save(new Course(5,"Test 3","Data from SpringJpa"));
        springJpaRepository.save(new Course(6,"Test 1","Data from SpringJpa"));
        springJpaRepository.deleteById(2l);
        System.out.println(springJpaRepository.findById(3l));

        System.out.println("-----------");
        System.out.println(springJpaRepository.findAll());
        System.out.println(springJpaRepository.count());
        System.out.println("-----------");
        System.out.println(springJpaRepository.findByAuthor("Test 1"));
        System.out.println("-----------");
        System.out.println(springJpaRepository.findByAuthor(""));

    }
}
