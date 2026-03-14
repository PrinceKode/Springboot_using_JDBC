package com.prince.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.beans.Student;
import com.prince.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public List<Student> loginService(String email, String password) {
        return loginDao.loginDao(email, password);
    }
}