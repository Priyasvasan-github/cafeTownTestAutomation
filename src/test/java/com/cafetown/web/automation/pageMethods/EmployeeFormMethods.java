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
        employeeForm.clickAddButton();
    }

    private void addEmployeeData(String firstName, String lastName, String startDate, String email) {
        employeeDetailsPage.clickAddButton();
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
}
