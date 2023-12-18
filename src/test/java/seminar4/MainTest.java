package seminar4;

import org.junit.jupiter.api.Test;


import java.util.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


class MainTest {

    /**
     * 4.0. Проверка работы Mockito
     */
     @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
      @Test
      public void iteratorWillReturnHelloWorld() {
          // Это некий объект нужного нам класса и дальше мы можем задавать ему поведение.
          Iterator iteratorMock = mock(Iterator.class);
          when(iteratorMock.next()).thenReturn("Hello").thenReturn("World!");
            String result = iteratorMock.next() + " " + iteratorMock.next();
            assertThat(result).isEqualTo("Hello World!");
      }

}