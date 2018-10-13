package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by Sripriya srinivasan on 10/13/2018.
 */
public class HomePage extends BaseUtils{

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement submitButton;

    @FindBy(css="input[ng-model='user.name']")
    public WebElement userIdText;

    @FindBy(css="input[ng-model='user.password']")
    public WebElement passwordText;

    @FindBy(css = ".error-message.ng-binding")
    public WebElement errorMessage;

    /**
     * This method enters text into userName Field
     * @param userName -> user name for login
     */
    public void enterUserNameText(String userName){
        enterTextInto(userIdText,userName);
    }

    /**
     * This method enters text into userName Field
     * @param passWord -> password for login
     */
    public void enterPasswordText(String passWord){
        enterTextInto(passwordText,passWord);
    }

    /**
     * This method clicks on submit button
     */
    public void clickLoginButton(){
        submitButton.click();
    }

    /**
     * This method enters text into userName Field
     * @return String --> returns a error message if Displayed
     */
    public String getErrorMessage(){
        return errorMessage.getText();
    }

    /**
     * This method returns if submit button is displayed or not
     * @return
     */
    public boolean isLoginButtonDisplayed(){
        return submitButton.isDisplayed();
    }
}
