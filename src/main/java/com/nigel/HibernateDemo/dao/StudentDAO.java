package com.nigel.HibernateDemo.dao;

import com.nigel.HibernateDemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}
