package DriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverInitiation {
    public WebDriver webdriver = null;
    public DriverInitiation() throws Exception{
        webdriver = new ChromeDriver();
        webdriver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        webdriver.manage().window().maximize();
        Thread.sleep(1000);
    }
}
