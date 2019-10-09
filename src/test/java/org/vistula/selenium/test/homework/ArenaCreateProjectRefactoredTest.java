package org.vistula.selenium.test.homework;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArenaCreateProjectRefactoredTest extends ArenaTest {

    @Test
    public void shouldCreateProject() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.shouldLogin("administrator@testarena.pl", "sumXQQ72$L");

        AdminPanel adminPanel = new AdminPanel(driver);
        adminPanel.shouldClickCockpit();

        WebElement addProjectButton = driver.findElement(By.className("button_link_li"));
        addProjectButton.click();

        WebElement insertName = driver.findElement(By.id("name"));
        String randomProjectName = RandomStringUtils.randomAlphabetic(10);
        insertName.sendKeys(randomProjectName);

        WebElement insertPrefix = driver.findElement(By.id("prefix"));
        String randomProjectPrefix = RandomStringUtils.randomAlphanumeric(10);
        insertPrefix.sendKeys(randomProjectPrefix);

        WebElement saveProject = driver.findElement(By.id("save"));
        saveProject.click();

        WebElement projectPanel = driver.findElement(By.className("item2"));
        projectPanel.click();

        WebElement searchProject = driver.findElement(By.id("search"));
        searchProject.sendKeys(randomProjectName);

        WebElement searchProjectButton = driver.findElement(By.id("j_searchButton"));
        searchProjectButton.click();





    }




}
