package seminar4.message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class NotificationServiceTest {
    @Test
    void NotificationTest(){
        MessageService messageService = mock(MessageService.class);

        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("test", "roman");

        verify(messageService, times(1)).sendMessage("test", "roman");
    }
}