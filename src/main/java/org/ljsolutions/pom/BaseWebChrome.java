package org.ljsolutions.pom;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseWebChrome {
   static WebDriver chromeDriver;

    public static WebDriver init(String urlInput){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chop = new ChromeOptions();
        chop.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(chop);
        chromeDriver.manage().deleteAllCookies();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }
}
