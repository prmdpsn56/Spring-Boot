package com.example.demo.JPA;


import com.example.demo.Model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class JpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
            entityManager.merge(course);
    }

    public void  deleteById(int id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

    public Course findById (int id) {
        return entityManager.find(Course.class,id);
    }
}
