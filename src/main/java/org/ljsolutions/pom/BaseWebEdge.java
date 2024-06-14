package org.ljsolutions.pom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class BaseWebEdge {
    //The Base class requires the following static variables WebDriver, String browsername, string URL
    static WebDriver baseWebDriverEdge;



    //The pattern requires a static function that returns the WebDriver to be used in the tests

    public static WebDriver init(String urlInput){

        WebDriverManager.edgedriver().setup();
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--remote-allow-origins=*");
        baseWebDriverEdge = new EdgeDriver(eo);
        baseWebDriverEdge.manage().window().maximize();
        baseWebDriverEdge.manage().deleteAllCookies();
        baseWebDriverEdge.get(urlInput);
        return baseWebDriverEdge;
    }

}
