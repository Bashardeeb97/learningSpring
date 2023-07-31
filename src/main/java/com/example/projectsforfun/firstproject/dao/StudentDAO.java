package com.example.projectsforfun.firstproject.dao;

import com.example.projectsforfun.firstproject.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDAO {

    void saveStudent(Student student);

      List<Student> readAll();

        Student readStudentById(int id);

    Student findStudentByFirstName(String firstName);

    void updateStudentByFirstName(String oldFirstName,String newFirstNmae);

    void removeStudent(int studentId);

    int deletAll();

}
