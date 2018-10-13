package com.cafetown.web.automation.pageMethods;

import com.cafetown.web.automation.pageObjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.yecht.Data;

/**
 * Created by Sripriya srinivasan on 10/13/2018.
 */
public class HomePageMethods {
    private HomePage homePage;

    public void launchApplication(){
        homePage.open();
    }

    /**
     * This method is used for login into application
     * @param userName is user name  for login into application
     * @param password is password for login into application
     */
    @Step
    public void login(String userName, String password){
        homePage.enterUserNameText(userName);
        homePage.enterPasswordText(password);
        homePage.clickLoginButton();
    }

    /**
     * This method returns the error message on Login screen
     * @return error message as a Sting
     */
    @Step
    public String getErrorMessageOnLoginFailure(){
        return homePage.getErrorMessage();
    }

    /**
     * This method is to login with valid Login credentials
     */
    @Step
    public void loginUsingValidCredentials(){
        login("Luke","Skywalker");
    }

    /**
     * This method returns if login page is loaded properly
     * @return
     */
    @Step
    public boolean isHomePageLoaded(){
        return homePage.isLoginButtonDisplayed();
    }
}
