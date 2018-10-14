package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

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

    /**
     * Below get methods returns employee details field wise
     */
    public String getEmployeeFirstName(){
        return firstNameInputText.getAttribute("value");
    }

    public String getEmployeeLastName(){
        return lastNameInputText.getAttribute("value");
    }

    public String getEmployeeEmail(){
        return emailInputText.getAttribute("value");
    }

    public String getEmployeeStartDate(){
        return startDateInputText.getAttribute("value");
    }
}
