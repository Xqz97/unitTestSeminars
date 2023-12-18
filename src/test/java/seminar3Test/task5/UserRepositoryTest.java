package seminar3Test.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.task1.User;
import seminar3.task1.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class UserRepositoryTest {

    UserRepository repository;
    @BeforeEach
    void setup(){
        repository = new UserRepository();
    }

    @Test
    void addUserToRepository(){
        User user = new User("Roma", "1234");
        user.authentication("1234", "Roma");
        repository.addUser(user);
        assertTrue(repository.data.contains(user));
    }


}