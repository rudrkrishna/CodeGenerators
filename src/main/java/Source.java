import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Source {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rudrkrishna/IntelliJ Projects/JavaPractice/chromedriver");

        // Set up Chrome options (optional)
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless"); // Run Chrome in headless mode (no GUI)

        // Create Chrome driver
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.awslagi.com/aws-certified-cloud-practitioner/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> list= driver.findElements(By.xpath("//div[@class=\"su-spoiler-title\"]"));
        for(WebElement element : list){
            element.click();
        }
        Thread.sleep(10000);

    }
}
