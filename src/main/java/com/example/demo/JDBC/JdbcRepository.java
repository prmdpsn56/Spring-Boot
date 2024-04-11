package com.example.demo.JDBC;

import com.example.demo.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static  String INSERT_QUERY= """ 
    insert into course (id, name, author) values (?,?,?);
    """;

    private static  String DELETE_QUERY= """ 
    delete from course where id=?
    """;

    private static  String SELECT_QUERY= """ 
    Select * from course where id=?
    """;

    public void insert(Course course){
        System.out.println("insert query executed");
        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(int courseId){
        System.out.println("insert query executed");
        jdbcTemplate.update(DELETE_QUERY,courseId);
    }

    public Course findById(int courseId){
        System.out.println("select query executed");
        return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),courseId);
    }
}
