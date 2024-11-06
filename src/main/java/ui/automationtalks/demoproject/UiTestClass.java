package ui.automationtalks.demoproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class UiTestClass {
    WebDriver driver;

    @BeforeMethod
    public void launchDriver() throws MalformedURLException {

        // Set up ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setCapability("platformName", "Windows 11");

        // Set capabilities for the remote WebDriver
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        options.merge(capabilities);

        // Use RemoteWebDriver with hub URL
      //  driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), options);
         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void test1() {
        driver.get("https://www.fb.com");
        String title = driver.getTitle();
        System.out.println("test1 title ---->" + title);

    }


    @Test(priority = 2)
    public void test2() {
        driver.get("https://www.google.com");
      String title = driver.getTitle();
        System.out.println("test2 title ---->" + title);
        //new change in new-branch
        //new change in new-branch
        //change in initial-setup 10:35

        System.out.println("change in new-branch 11:03");

    }


    @AfterMethod
    public void postCondition(){
        // Safely quit the driver if it exists
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Exception occurred while closing the driver: " + e.getMessage());
            }
        }
    }
}
