package org.vistula.selenium.test.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanel {

    private WebDriver driver;

    @FindBy(className = "header_admin" )
    private WebElement adminPanel;

    public AdminPanel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shouldClickCockpit(){
        adminPanel.click();
    }
}
