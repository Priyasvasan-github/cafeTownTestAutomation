package com.cafetown.web.automation.stepDefinitions.deleteEmployee;

import com.cafetown.web.automation.pageMethods.EmployeeDetailsMethods;
import com.cafetown.web.automation.pageMethods.EmployeeListMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya Srinivasan on 10/14/2018.
 */
public class DeleteEmployeeSteps {

    @Steps
    EmployeeListMethods employeeListSteps;

    @Steps
    EmployeeDetailsMethods employeeDetailsSteps;

    @When("^He delete the employee details of (.*)")
    public void deleteEmployeeDetails(String firstName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isTrue();
        employeeDetailsSteps.deleteEmployeeInformation();
    }

    @Then("^User details of (.*) are Deleted$")
    public void verifyEmployeeDetailsAreDeleted(String firstName) {
        assertThat(employeeListSteps.verifyIfEmployeeExist(firstName)).isFalse();
    }
}
