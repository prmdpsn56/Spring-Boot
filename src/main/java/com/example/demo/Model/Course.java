package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {


    @Id
    private long id;
    private String author;
    private  String name;

    public Course() {}

    public Course(long id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
