public class UserController {

    UsersService usersService;
    public UserController(UsersService usersService){
        this.usersService = usersService;
    }
    public UsersDao getUsers(){
        return usersService.getUsers();
    }
}
