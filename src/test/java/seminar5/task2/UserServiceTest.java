package seminar5.task2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Test
    void testGetName(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        assertThat(userService.getUserName(1)).isEqualTo("User 1");
    }

}