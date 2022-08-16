package org.example.service;

import org.assertj.core.api.Assertions;
import org.example.dataaccess.UsersRepository;
import org.example.pojo.UsersDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

public class UserServiceTest {

    @Mock
    UsersRepository usersRepository;

    @Before
    public void Initialize(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getUsersTest(){
        Users controller = new Users(usersRepository);
        UsersDao usersDao = UsersDao.builder().userId(1).userName("User01").emailId("User01@gmail.com").build();
        doReturn(usersDao).when(usersRepository).getUsers();
        Assertions.assertThat(controller.getUsers()).isInstanceOf(UsersDao.class);
    }

}
