package com.cafetown.web.automation.stepDefinitions.updateEmployee;

import com.cafetown.web.automation.pageMethods.EmployeeDetailsMethods;
import com.cafetown.web.automation.pageMethods.EmployeeFormMethods;
import com.cafetown.web.automation.pageMethods.EmployeeListMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class UpdateEmployeeSteps {

    @Steps
    EmployeeFormMethods employeeFormSteps;

    @Steps
    EmployeeListMethods employeeListSteps;

    @When("^He updates (.*) of (.*) from (.*) to (.*)$")
    public void updateUserDetails(String recordType, String firstName, String oldValue,String newValue) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isTrue();
        employeeFormSteps.updateEmployeeDetails(recordType,newValue);
    }

    @Then("^His (.*) of (.*) is updated to (.*)$")
    public void verifyUpdatedUserDetails(String recordType,String oldValue,String newValue) {
        if(recordType.equalsIgnoreCase("firstName")){
            assertThat(employeeListSteps.verifyIfEmployeeExist(newValue)).isTrue();
        }else{
            assertThat(employeeListSteps.verifyIfEmployeeExist(oldValue)).isTrue();
        }
        employeeFormSteps.viewEmployeeInformation();
        assertThat(employeeFormSteps.verifyRecordTypeIsUpdated(recordType)).isEqualToIgnoringCase(newValue);
    }

    @When("^He want to view the details of the (.*), (.*)$")
    public void viewEmployeeDetails(String firstName,String lastName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isTrue();
        employeeFormSteps.viewEmployeeInformation();
    }


    @Then("^User details are Displayed as (.*), (.*), (.*), (.*)$")
    public void verifyEmployeeDetails(String firstName, String lastName, String startDate, String email) {
        assertThat(employeeFormSteps.verifyRecordTypeIsUpdated("firstName")).isEqualToIgnoringCase(firstName);
        assertThat(employeeFormSteps.verifyRecordTypeIsUpdated("lastName")).isEqualToIgnoringCase(lastName);
        assertThat(employeeFormSteps.verifyRecordTypeIsUpdated("startDate")).isEqualToIgnoringCase(startDate);
        assertThat(employeeFormSteps.verifyRecordTypeIsUpdated("email")).isEqualToIgnoringCase(email);
   }

    @When("^He want to view the details of the (.*)$")
    public void viewEmployeeDetailsDoesNotexist(String firstName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isFalse();

    }

    @Then("^User details of (.*) are not found$")
    public void userRecordsNotFound(String firstName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isFalse();
    }
}
