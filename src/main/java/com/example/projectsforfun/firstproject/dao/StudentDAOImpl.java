package com.example.projectsforfun.firstproject.dao;

import com.example.projectsforfun.firstproject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
     entityManager.persist(student);
    }

    @Override
    public Student readStudentById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> readAll(){

        TypedQuery<Student> typedQuery = entityManager.createQuery("From Student order by firstName desc", Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public Student findStudentByFirstName(String firstName){
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE firstName=:nameParam", Student.class);
        query.setParameter("nameParam",firstName);
        return query.getResultList().get(0);
    }

    @Override
    @Transactional
    public void updateStudentByFirstName(String oldFirstName,String newFirstNmae){

        Student studentByFirstName = findStudentByFirstName(oldFirstName);
        studentByFirstName.setFirstName(newFirstNmae);
        entityManager.merge(studentByFirstName);

    }

    @Override
    @Transactional
    public void removeStudent(int studentId) {
        Student student = entityManager.find(Student.class, studentId);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deletAll() {
        return entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }

    ;


}
