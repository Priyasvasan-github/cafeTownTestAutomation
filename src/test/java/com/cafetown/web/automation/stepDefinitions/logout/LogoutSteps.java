package com.cafetown.web.automation.stepDefinitions.logout;

import com.cafetown.web.automation.pageMethods.EmployeeDetailsMethods;
import com.cafetown.web.automation.pageMethods.HomePageMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class LogoutSteps {

    @Steps
    HomePageMethods homePageSteps;

    @Steps
    EmployeeDetailsMethods employeeDetailsSteps;

    @Given("^Luke is logged into the application$")
    public void successfulUserLogin() {
      homePageSteps.loginUsingValidCredentials();
    }


    @When("^He try to Logout of the application$")
    public void logoutOfApplication() {
        employeeDetailsSteps.logoutOfApplication();
    }

    @Then("^He should land on Login view$")
    public void verifyLogout() {
        assertThat(homePageSteps.isHomePageLoaded()).isTrue();
    }

}
