module com.example.webdriver_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;


    opens com.example.webdriver_java to javafx.fxml;
    exports com.example.webdriver_java;
}