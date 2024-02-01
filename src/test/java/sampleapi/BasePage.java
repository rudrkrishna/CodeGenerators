package sampleapi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver;
    JavascriptExecutor js;

    public WebDriver setUp(String browser){

            System.setProperty("webdriver.chrome.driver","/Users/rudrkrishna/IntelliJ Projects/JavaPractice/src/main/resources/chromedriver");
            driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         js = (JavascriptExecutor) driver;
         return driver;
    }

    public void tearDown(){
        driver.quit();
    }
}
