package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Sripriya Srinivasan  on 10/13/2018.
 */
public class EmployeeForm extends BaseUtils{

    @FindBy(css="input[ng-model='selectedEmployee.firstName']")
    public WebElement firstNameInputText;

    @FindBy(css="input[ng-model='selectedEmployee.lastName']")
    public WebElement lastNameInputText;

    @FindBy(css="input[ng-model='selectedEmployee.startDate']")
    public WebElement startDateInputText;

    @FindBy(css="input[ng-model='selectedEmployee.email']")
    public WebElement emailInputText;

    @FindBy(xpath="//button[contains(text(),'Add')]")
    public WebElement addButton;

    @FindBy(xpath="//button[contains(text(),'Update')]")
    public WebElement updateButton;

    /**
     * This method adds text into first name field
     * @param firstName is input field for employee form
     */
    public void addTextToFirstNameField(String firstName){
        enterTextInto(firstNameInputText,firstName);
    }

    /**
     * This method adds text into last name field
     * @param lastName is input field for employee form
     */
    public void addTextToLastNameField(String lastName){
        enterTextInto(lastNameInputText,lastName);
    }

    /**
     * This method adds text into Email field
     * @param email is input field for employee form
     */
    public void addTextToEmailField(String email){
        enterTextInto(emailInputText,email);
    }

    /**
     * This method adds text into Date field
     * @param startDate is input field for employee form
     * */
    public void addTextToDateField(String startDate){
        enterTextInto(startDateInputText,startDate);
    }

    /**
     * This method clicks on Add Button and wait for alerts to accept
     */
    public void clickAddButton(){
        addButton.click();
        //Serenity BDD doesn't support handling alerts at step level so handling it in page objects
        try{
            this.waitFor(ExpectedConditions.presenceOfElementLocated(By.id("bAdd")));
        }catch (Exception e){
            if(isAlertPresent()){
                this.getAlert().accept();
            }
        }
    }

    /**
     * This method clicks on Update Button
     */
    public void clickUpdateButton(){
        updateButton.click();
    }

    /**
     * This method return employee form visibility
     * @return status of employee form visibility
     */
    public boolean isFirstNameFieldDisplayed(){
        if(isAlertPresent()){
            this.getAlert().accept();
            return firstNameInputText.isDisplayed();
        }else{
            return firstNameInputText.isDisplayed();
        }
    }
}
