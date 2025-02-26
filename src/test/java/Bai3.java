import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3 {

    ChromeDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testDK() {
        chromeDriver.get("https://www.zoho.com/vi/calendar/signup.html");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        WebElement btn1 = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//span[@id='signup-termservice']")))) ;
        btn1.click();

        WebElement hoTen = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        hoTen.sendKeys("Vũ Tiến Đạt");

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("datvtph50396@gmail.com");

        WebElement mk = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        mk.sendKeys("datvt12483");

        WebElement btn = chromeDriver.findElement(By.xpath("//input[@id='signupbtn']"));
        btn.click();
    }

    @Test
    public void testDN() {
        chromeDriver.get("https://accounts.zoho.com/signin?service_language=vi&servicename=ZohoCalendar&signupurl=https://www.zoho.com/vi/calendar/signup.html");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//input[@id='login_id']"))));
        email.sendKeys("datvtph50396@gmail.com");

        WebElement btnKe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Kế tiếp')]")));
        btnKe.click();

        WebElement mk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
        mk.sendKeys("datvt12483");

        WebElement btn = chromeDriver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Đăng nhập')]"));
        btn.click();
    }
}
