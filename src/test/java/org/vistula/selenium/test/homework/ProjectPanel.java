package org.vistula.selenium.test.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPanel {

    private WebDriver driver;

    @FindBy(className = "item2")
    private WebElement projectList;

    public ProjectPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void shouldClickProjectList() {
            projectList.click();

}

}

