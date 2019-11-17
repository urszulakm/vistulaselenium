package org.vistula.selenium.test.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "email" )
    private WebElement emailForm;

    @FindBy(id = "password")
    private WebElement passwordForm;

    @FindBy(id = "login")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shouldLogin(String login, String password) {

        emailForm.sendKeys(login);
        passwordForm.sendKeys(password);
        loginButton.click();
    }
}
