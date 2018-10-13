package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeDetailsPage extends BaseUtils {
    @FindBy(id="greetings")
    public WebElement welcomeMessage;

    /**
     * This Method returns welcome Message After Login
     * @return Welcome message as String
     */
    public String getWelcomeMessage(){
        return welcomeMessage.getText();
    }
}
