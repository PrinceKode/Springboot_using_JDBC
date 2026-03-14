package com.prince.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prince.beans.Student;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loginDao(String email, String password) {

        List<Student> students_list = null;

        try {

            String sql = "SELECT * FROM register WHERE email=? AND password=?";
            students_list = jdbcTemplate.query(sql, new StudentMapper(), email, password);

        } catch (Exception e) {

            System.out.println("Database error occurred");
            e.printStackTrace();

        }

        return students_list;
    }
}