package seminar5.task4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;

public class SeleniumTest2 {
    @Test
    public void testAuthorization(){
            String login = "standard_user";
            String password = "secret_sauce";
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();
            webDriver.get("https://www.saucedemo.com/");

            WebElement loginBox = webDriver.findElement(By.id("user-name"));
            loginBox.sendKeys(login);

            WebElement passwordBox = webDriver.findElement(By.id("password"));
            passwordBox.sendKeys(password);

            WebElement loginButton = webDriver.findElement(By.id("login-button"));
            loginButton.click();

            WebElement productLabel = webDriver.findElement(By.className("title"));
            String findText = productLabel.getText();

            webDriver.quit();

            assertThat(findText).isEqualTo("Products");
        }
}
