package org.example.controller;
import org.example.pojo.UsersDao;
import org.example.service.UsersService;

public class UserController {

    UsersService usersService;
    public UserController(UsersService usersService){
        this.usersService = usersService;
    }
    public UsersDao getUsers(){
        return usersService.getUsers();
    }
}
