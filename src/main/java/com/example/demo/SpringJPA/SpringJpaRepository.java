package com.example.demo.SpringJPA;

import com.example.demo.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringJpaRepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);

}
