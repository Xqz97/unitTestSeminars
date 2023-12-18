package seminar4.database;


import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
class DataProcessorTest {
    @Test
    void dataProcessorWorkCorrectly(){

        Database database = mock(Database.class);
        when(database.query(anyString())).thenReturn(Arrays.asList("Test1", "Test2", "Test3"));
        DataProcessor dataProcessor = new DataProcessor(database);
        assertThat(dataProcessor.processData("dsfsdfsd").size()).isEqualTo(3);

    }
}