package org.example.controller;

import org.assertj.core.api.Assertions;
import org.example.pojo.UsersDao;
import org.example.service.UsersService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

public class UserControllerTest {

    @Mock
    UsersService usersService;

    @Before
    public void Initialize(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getUsersTest(){
        UserController controller = new UserController(usersService);
        UsersDao usersDao = UsersDao.builder().userId(1).userName("User01").emailId("User01@gmail.com").build();
        doReturn(usersDao).when(usersService).getUsers();
        Assertions.assertThat(controller.getUsers()).isInstanceOf(UsersDao.class);
    }
}
