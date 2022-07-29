import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsersDao {
    private int userId;
    private String userName;
    private String emailId;
}
