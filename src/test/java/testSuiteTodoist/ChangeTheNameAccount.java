package testSuiteTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testSuite.BaseTestTodoLy;

public class ChangeTheNameAccount extends BaseTestTodoist {
    @Test
    @DisplayName("Change the name of the account successfully")
    public void changeTheNameOfAccount() throws InterruptedException {
        mainPageTodoist.loginButton.click();
        loginPageTodoist.login("valeria.zerain@gmail.com","Pruebas123");
        menuSectionTodoist.profileButton.click();
        menuSectionTodoist.settingsButton.click();
        String expectedResult = "valeria.zerain";
        settingSection.nameTextbox.clearSetText("valeria.zerain");
        settingSection.buttonSubmit.click();
        String actualResult = settingSection.nameTextbox.getPropertyValue("value");
        Assertions.assertEquals(expectedResult, actualResult, "ERROR The name was not changed");
    }
}
