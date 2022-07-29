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
