package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static class01.TestNGExample.driver;

public class AssertionBasic {

    @Test
    public void invalidCredentials(){
//        locate the Webelement username and send keys
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

//        locate the webElement password and send keys
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("abracadbra");

//        locate login button and click login
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
//verify the error message
        WebElement error = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorMsg = error.getText();
//        check if the error message is correct
        String expectedError = "Invalid credentials";

//        assert the value
        Assert.assertEquals(errorMsg,expectedError);

//        finding the password again as it is discarded when we clicked on login button because
//        the DOM refeshed
//        password text box is displayed
        password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        boolean pswrdDisplayed = password.isDisplayed();
//        verify that the text box is displayed
        Assert.assertTrue(pswrdDisplayed);

    }

}