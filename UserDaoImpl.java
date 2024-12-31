package com.mock.dao;

public class UserDaoImpl implements UserDao {

    public String findNameById(Integer id){
        return "Raj";
    }

    public String findEmailById(Integer id){
        return "raje@gmail.com";
    }
    
}