package ui.automationtalks.demoproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class UiTestClass {
    WebDriver driver;


    @BeforeMethod
    public void launchDriver() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();


        options.setCapability("platformName", "Windows 11");

        // Use WebDriverManager to handle the driver setup
        WebDriverManager.chromedriver().setup();

        // Pass ChromeOptions to RemoteWebDriver
        driver = new RemoteWebDriver(new URL("http://192.168.79.206:4444"), options);

        // Open the browser and configure timeouts
        driver.get("https://www.fb.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
         String title = driver.getTitle();
         System.out.println("test1 title ---->"+title);
         driver.quit();

    }


    @Test
    public void test2() {
        @Nullable String title = driver.getTitle();
        System.out.println("test2 title ---->" + title);
        driver.quit();
    }
}
