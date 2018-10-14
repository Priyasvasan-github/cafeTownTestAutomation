package com.cafetown.web.automation.pageMethods;

import com.cafetown.web.automation.pageObjects.EmployeeDetailsPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeDetailsMethods {

    private EmployeeDetailsPage employeeDetailsPage;

    /**
     * This Method returns welcome Message After Login
     * @return Welcome message as String
     */
    @Step
    public String getWelcomeMessage(){
        return employeeDetailsPage.getWelcomeMessage();
    }

    /**
     * This method log out user from application
     */
    @Step
    public void logoutOfApplication(){
        employeeDetailsPage.clickLogoutButton();
    }

    /**
     * This method opens a Create employee form
     */
    @Step
    public void viewCreateEmployeeForm(){
        employeeDetailsPage.clickCreateButton();
    }

    /**
     * This method opens a Create employee form
     */
    @Step
    public void updateEmployeeDetails(){
        employeeDetailsPage.clickCreateButton();
    }

    /**
     * This method opens a Create employee form
     */
    @Step
    public void deleteEmployeeInformation(){
        employeeDetailsPage.clickEditButton();
        employeeDetailsPage.clickDeleteButton();
    }

}
