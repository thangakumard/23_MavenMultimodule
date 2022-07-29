public class UserController {

    UsersService usersService;
    public UserController(UsersService usersService){
        this.usersService = usersService;
    }
    public void getUsers(){
        usersService.getUsers();
    }
}
