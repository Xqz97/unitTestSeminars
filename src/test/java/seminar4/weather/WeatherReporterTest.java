package seminar4.weather;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import seminar4.card.CreditCard;

import static org.mockito.Mockito.*;
class WeatherReporterTest {
    @Test
    void weatherReporterCorrectOrNot(){
        // Каждый тест состоит из трех фаз.
        // Сначала создаем мок объект.
        WeatherService service = mock(WeatherService.class);
        // Создаем ему поведение.
        when(service.getCurrentTemperature()).thenReturn(25);

        WeatherReporter weatherReporter = new WeatherReporter(service);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 25 градусов.");

    }

}