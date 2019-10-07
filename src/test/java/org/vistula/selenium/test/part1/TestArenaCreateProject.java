package org.vistula.selenium.test.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.ec.point.ProjectivePoint;

import java.util.Random;

public class TestArenaCreateProject {

    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }


    @Test
    public void shouldCreateProject() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.testarena.pl/zaloguj");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login"));


        email.sendKeys("administrator@testarena.pl");
        password.sendKeys("sumXQQ72$L");
        login.click();

        WebElement adminpanel = driver.findElement(By.cssSelector("a[href='http://demo.testarena.pl/administration']"));
        adminpanel.click();

        WebElement addProject = driver.findElement(By.cssSelector("a[href='http://demo.testarena.pl/administration/add_project']"));
        addProject.click();

        WebElement insertName = driver.findElement(By.id("name"));
        String randomProjectName = RandomStringUtils.randomAlphabetic(10);
        insertName.sendKeys(randomProjectName);


        WebElement insertPrefix = driver.findElement(By.id("prefix"));
        String randomProjectPrefix = RandomStringUtils.randomAlphanumeric(10);
        insertPrefix.sendKeys(randomProjectPrefix);

        WebElement saveProject = driver.findElement(By.id("save"));
        saveProject.click();

        WebElement projectPanel = driver.findElement(By.cssSelector("a[href='http://demo.testarena.pl/administration/projects']"));
        projectPanel.click();

        WebElement searchProject = driver.findElement(By.id("search"));
        searchProject.sendKeys(randomProjectName);

        WebElement searchProjectButton = driver.findElement(By.id("j_searchButton"));
        searchProjectButton.click();





    }


}
