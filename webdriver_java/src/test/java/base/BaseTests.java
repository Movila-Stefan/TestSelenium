package base;

import Page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    public HomePage homePage;


@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
       // driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
       // driver.manage().window().setSize(new Dimension(375,812));

       // List<WebElement> links =
       // driver.findElements(By.tagName("a"));
       // System.out.println(links.size());


       // WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
       // inputsLink.click();

        //LinkText no found
       // WebElement AngieLink = driver.findElement(By.linkText("Angie"));
       // inputsLink.click();

       // System.out.println(driver.getTitle());
       // driver.quit();

    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }

   // public static void main(String[] args) {
  //      BaseTests test = new BaseTests();
  //      test.setUp();
  //  }
}
