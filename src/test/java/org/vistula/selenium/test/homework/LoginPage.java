package org.vistula.selenium.test.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private WebElement emailForm;
    private WebElement passwordForm;
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        initElements();

    }

    private void initElements() {
        emailForm = driver.findElement(By.id("email"));
        passwordForm = driver.findElement(By.id("password"));
        loginButton = driver.findElement(By.id("login"));
    }

    public void shouldLogin(String login, String password) {

        emailForm.sendKeys(login);
        passwordForm.sendKeys(password);
        loginButton.click();
    }
}
