package org.vistula.selenium.test.homework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void waitForProjectPrefixData() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("t_number")));
    }

    public void verifyProjectWithPrefixExists(String projectPrefix) {
        WebElement tableData = driver.findElement(By.className("t_number"));
        Assertions.assertThat(tableData.getText()).contains(projectPrefix);
    }
}

