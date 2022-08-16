package org.example.service;

import org.example.dataaccess.UsersRepository;
import org.example.pojo.UsersDao;

public class Users implements UsersService {
    UsersRepository usersRepository;
    public Users(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    public UsersDao getUsers(){
        System.out.println("User service is accessing dataaccess layer!");
        return usersRepository.getUsers();
    }
}
