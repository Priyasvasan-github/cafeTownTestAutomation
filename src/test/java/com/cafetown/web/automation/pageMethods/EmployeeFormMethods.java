package com.cafetown.web.automation.pageMethods;

import com.cafetown.web.automation.pageObjects.EmployeeDetailsPage;
import com.cafetown.web.automation.pageObjects.EmployeeForm;
import net.thucydides.core.annotations.Step;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeFormMethods {

    private EmployeeForm employeeForm;
    private EmployeeDetailsPage employeeDetailsPage;

    /**
     * This method is used to create employee
     * @param firstName
     * @param lastName
     * @param startDate
     * @param email
     */
    public void createAUser(String firstName,String lastName,String startDate,String email){
        addEmployeeData(firstName, lastName, startDate, email);
        employeeDetailsPage.clickAddButton();

    }

    private void addEmployeeData(String firstName, String lastName, String startDate, String email) {
        employeeDetailsPage.clickCreateButton();
        employeeForm.addTextToFirstNameField(firstName);
        employeeForm.addTextToLastNameField(lastName);
        employeeForm.addTextToDateField(startDate);
        employeeForm.addTextToEmailField(email);
    }

    /**
     * This method return employee form visibility
     * @return status of employee form visibility
     */
    @Step
    public boolean isEmployeeFormVisible(){
        return employeeForm.isFirstNameFieldDisplayed();
    }

    /**
     * This method updates a specific recordType to a newValue
     * @param recordType
     * @param newValue
     */
    @Step
    public void updateEmployeeDetails(String recordType, String newValue){
        viewEmployeeInformation();
        switch (recordType){
            case "firstName":
                employeeForm.addTextToFirstNameField(newValue);
                break;
            case "lastName":
                employeeForm.addTextToLastNameField(newValue);
                break;
            case "startDate":
                employeeForm.addTextToDateField(newValue);
                break;
            case "email":
                employeeForm.addTextToEmailField(newValue);
                break;
            default:
                throw new IllegalArgumentException("record type you are trying to edit doesn't exist");
        }
        employeeDetailsPage.clickUpdateButton();
    }

    @Step
    public String verifyRecordTypeIsUpdated(String recordType){
        switch (recordType){
            case "firstName":
                return employeeForm.getEmployeeFirstName();
            case "lastName":
                return employeeForm.getEmployeeLastName();
            case "startDate":
                return employeeForm.getEmployeeStartDate();
            case "email":
                return employeeForm.getEmployeeEmail();
            default:
                throw new IllegalArgumentException("record type you are trying to edit doesn't exist");
        }
    }

    @Step
    public void viewEmployeeInformation(){
        employeeDetailsPage.clickEditButton();
    }
}
