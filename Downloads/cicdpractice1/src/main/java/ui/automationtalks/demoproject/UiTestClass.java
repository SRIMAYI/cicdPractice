package ui.automationtalks.demoproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UiTestClass {
    WebDriver driver;
    @BeforeMethod
    public void launchDriver(){
          WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
         String title = driver.getTitle();
         System.out.println("test1 title ---->"+title);
    }


    @Test
    public void test2(){
      @Nullable  String title = driver.getTitle();
        System.out.println("test2 title ---->"+title);
    }
}
