package part3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void googleSearch() {
        driver.get("https://www.google.pl");
        WebElement searchBox = driver.findElement(By.cssSelector("[title='Search'"));
        searchBox.sendKeys("Vistula University");
        searchBox.sendKeys(Keys.ENTER);
    }
}