package org.vistula.selenium.test.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectAdminPage {

    private WebDriver driver;

    @FindBy (className = "button_link_li")
    private WebElement addProjectButton;

    @FindBy (id = "search")
    private WebElement searchProjectField;

    @FindBy (id = "j_searchButton")
    private WebElement searchProjectButton;

    public ProjectAdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void shouldClickAddProject(){
        addProjectButton.click();
    }

    public void shouldEnterSearchedProjectName(String randomProjectName){
        searchProjectField.sendKeys(randomProjectName);
        }

    public void shouldClickSearchProject(){
        searchProjectButton.click();
    }
}

