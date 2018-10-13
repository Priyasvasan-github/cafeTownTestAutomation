package com.cafetown.web.automation.stepDefinitions.addEmployee;

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
public class addEmployeeSteps {

    @Steps
    EmployeeFormMethods employeeFormSteps;

    @Steps
    EmployeeListMethods employeeListSteps;

    @When("^He attempts to add user with details (.*),(.*),(.*),(.*)$")
    public void addEmployeeDetails(String firstName,String lastName,String startDate,String email) {
        employeeFormSteps.createAUser(firstName,lastName,startDate,email);
    }

    @Then("^User details of (.*) are added successfully$")
    public void verifyUserDetailsAdded(String firstName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isTrue();
    }

    @Then("^Employee is not created$")
    public void assertEmployeeCreationFailure() {
        assertThat(employeeFormSteps.isEmployeeFormVisible()).isTrue();
    }

}
