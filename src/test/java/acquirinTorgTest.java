import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class acquirinTorgTest {
    WebDriver driver;
    @Before
    public void autorization () {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\2\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void theend() {
        driver.close();
    }

    @Test

    public void acquringObichnij() {
        driver.get("https://rumskapt529.open.ru/529/login");
        driver.manage().window().maximize();


        driver.findElement(By.name("username")).sendKeys("4799870781");
        driver.findElement(By.name("password")).sendKeys("Qq!11111");


        // нажать на кнопку "Вход"
        driver.findElement(By.xpath("//*[@data-test-id='loginButton']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // неявное ожидание был слип 6 секунд

        //нажать на ""Эквайринг"
        driver.findElement(By.xpath("//*[text()='Эквайринг']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Нажать на кнопку "Заполинть заявку"
        driver.findElement(By.xpath("//*[text()='Заполнить заявку']")).click();

        //Выбрать планируемый оборот !!!!!!!!!!!!!
        driver.findElement(By.xpath("")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // неявное ожидание


        //Нажать на кнопку "Отправить заявку"
        driver.findElement(By.xpath("//*[text()='Отправить заявку']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // неявное ожидание

    }
}
