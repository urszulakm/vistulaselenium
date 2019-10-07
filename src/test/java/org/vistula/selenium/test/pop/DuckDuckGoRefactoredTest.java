package org.vistula.selenium.test.pop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuckDuckGoRefactoredTest extends VistulaSeleniumTest  {
//klasa DuckDuckGoRefactoredTest dziedziczy po VistulaSeleniumTest <- dzieki "extends ...."


    @Test
    public void shouldFindVistula() {

        Homepage homepage = new Homepage(driver);
        homepage.search("Vistula University");

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.waitForSidebarLink();
        searchResultPage.verifyLinkUrl ("https://www.vistula.edu.pl/");


    }



}
