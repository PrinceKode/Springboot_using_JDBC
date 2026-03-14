package com.prince.service;

import java.util.List;

import com.prince.beans.Student;
public interface LoginService {

    List<Student> loginService(String email,String password);

}