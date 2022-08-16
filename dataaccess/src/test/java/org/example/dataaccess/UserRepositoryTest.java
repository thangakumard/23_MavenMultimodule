package org.example.dataaccess;

import org.assertj.core.api.Assertions;
import org.example.pojo.UsersDao;
import org.junit.Test;

public class UserRepositoryTest {

    @Test
    public void getUsersTest(){
        Users users = new Users();
        Assertions.assertThat(users.getUsers()).isInstanceOf(UsersDao.class);
    }
}
