package login;

import Page.LoginPage;
import Page.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
@Test
    public void testSuccessfullLogin (){
       LoginPage loginPage = homePage.clickFromAuthentication();
       loginPage.setUsername("thomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      assertTrue( secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is Incorrect");
    }

}
