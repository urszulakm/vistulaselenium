package org.vistula.selenium.test.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;


    @FindBy(id = "search_form_input_homepage")
    private WebElement searchBar;

    @FindBy(id = "search_button_homepage")
    private WebElement searchButton;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
       // initElement(); -> wywalamy, bo dodalismy to co w linii powyzej


    }

    public void search(String text) {
        searchBar.sendKeys(text);
        searchButton.click();
    }

  //  private void initElement() {
   //     searchBar = driver.findElement(By.id("search_form_input_homepage"));
   //     searchButton = driver.findElement(By.id("search_button_homepage"));
  //  } -> to wywalamy, bo wywalilismy initElement(), bo uzylismy API Selenium, zeby zainicjalizowac elementy
}
