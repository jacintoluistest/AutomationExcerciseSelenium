package org.ljsolutions.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutoexcerciseHomePage {

    //The constructor class requires a WebDriver object
    public AutoexcerciseHomePage(WebDriver testDriver){
        //Initialize web elements
        //Page Factory class allows to use @FindBy annotation to set up WebElements
        PageFactory.initElements(testDriver,this);
    }

}
