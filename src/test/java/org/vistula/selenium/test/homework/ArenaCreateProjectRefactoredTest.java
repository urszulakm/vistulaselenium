package org.vistula.selenium.test.homework;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class ArenaCreateProjectRefactoredTest extends ArenaTest {

    @Test
    public void shouldCreateProject() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.shouldLogin("administrator@testarena.pl", "sumXQQ72$L");

        AdminPanel adminPanel = new AdminPanel(driver);
        adminPanel.shouldClickCockpit();

        ProjectAdminPage projectAdminPage = new ProjectAdminPage(driver);
        projectAdminPage.shouldClickAddProject();

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        String randomProjectName = RandomStringUtils.randomAlphabetic(10);
        String randomProjectPrefix = RandomStringUtils.randomAlphanumeric(6);
        addProjectPage.shouldCreateProject(randomProjectName, randomProjectPrefix);

        ProjectPanel projectPanel = new ProjectPanel(driver);
        projectPanel.shouldClickProjectList();

        projectAdminPage.shouldEnterSearchedProjectName(randomProjectName);

        projectAdminPage.shouldClickSearchProject();

        projectAdminPage.waitForProjectPrefixData();
        projectAdminPage.verifyProjectWithPrefixExists(randomProjectPrefix, randomProjectName);
    }
}
