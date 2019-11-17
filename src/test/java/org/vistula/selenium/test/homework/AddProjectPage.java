package org.vistula.selenium.test.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProjectPage {
    private WebDriver driver;

    @FindBy (id = "name")
    private WebElement addProjectName;

    @FindBy (id = "prefix")
    private WebElement addPrefixName;

    @FindBy (id = "save")
    private WebElement saveProjectButton;

    public  AddProjectPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shouldCreateProject(String projectName, String prefix){
        addProjectName.sendKeys(projectName);
        addPrefixName.sendKeys(prefix);
        saveProjectButton.click();
    }
}




