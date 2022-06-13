package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    private By formAutentificationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public LoginPage clickFromAuthentication(){

        driver.findElement(formAutentificationLink).click();
        return new LoginPage(driver);
    }


}
