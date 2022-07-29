import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UserRepositoryTest {

    @Test
    public void getUsersTest(){
        Users users = new Users();
        Assertions.assertThat(users.getUsers()).isInstanceOf(UsersDao.class);
    }
}
