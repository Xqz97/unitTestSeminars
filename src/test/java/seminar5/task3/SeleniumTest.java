package seminar5.task3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class SeleniumTest {
    @Test
    public void browserTest() throws InterruptedException {
        // это ссылка на том место, где лежит драйвер.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
        // здесь мы создаем экземпляр класса WebDivider, то есть драйвера работающего именно с Chrome.
        // Важно что WebDivider это интерфейс.
        WebDriver webDriver = new ChromeDriver();
        // здесь мы пишем, какой адрес ввести в браузере с помощью драйвера.
        webDriver.get("https://google.com");
        // здесь мы присваиваем объекту элемент, то есть поисковую строку, найденную с помощью имения q, которое можно посмотреть в консоли разработчика.
        // так же можно брать и id и прочее, главное константы, чтобы не поменялось.
        WebElement searchBox = webDriver.findElement(By.name("q"));
        // данном случае вводиться информация в поисковую строку.
        searchBox.sendKeys("Selenium");
        // этот метод эмулирует в браузере нажатие клавиши Enter
        searchBox.submit();
        List<WebElement> searchResult = webDriver.findElements(By.cssSelector("div"));
        boolean find = false;
        for (WebElement element: searchResult){
            if (element.getText().contains("https://www.selenium.dev")){
                find = true;
                break;
            }
        }
        webDriver.quit();
        assertTrue(find);
    }
}
