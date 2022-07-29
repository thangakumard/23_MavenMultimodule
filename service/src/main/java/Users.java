public class Users implements UsersService {
    UsersRepository usersRepository;
    public Users(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    public void getUsers(){
        System.out.println("User service is accessing dataaccess layer!");
        usersRepository.getUsers();
    }
}
