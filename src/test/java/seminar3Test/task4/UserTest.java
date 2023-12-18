package seminar3Test.task4;


import org.junit.jupiter.api.*;
import seminar3.task1.User;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    private User user1;

    @BeforeEach
    void setup(){
        user1 = new User("Roma", "stalker");
    }

    @Test
    void authenticationPass(){
        assertTrue(user1.authentication("stalker", "Roma"));
    }

    @Test
    void authenticationFailed(){
        assertFalse(user1.authentication("stalker1", "Roma"));
    }
}
