package org.example.dataaccess;
import org.example.pojo.UsersDao;

public class Users implements UsersRepository{
    public UsersDao getUsers(){
        System.out.println("Getting the user information from database");
        UsersDao usersDao = UsersDao.builder().userId(2).userName("User02").emailId("user02@gmail.com").build();
        return usersDao;
    }
}
