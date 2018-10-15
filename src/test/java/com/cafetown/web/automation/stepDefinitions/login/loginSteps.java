package com.cafetown.web.automation.stepDefinitions.login;

import com.cafetown.web.automation.pageMethods.EmployeeDetailsMethods;
import com.cafetown.web.automation.pageMethods.HomePageMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya Srinivasan on 10/12/2018.
 */
public class loginSteps {

    @Steps
    HomePageMethods homePageSteps;

    @Steps
    EmployeeDetailsMethods employeeDetailsSteps;

    @Given("^Luke is user accessing the portal$")
    public void accessThePortal() {
        homePageSteps.launchApplication();
    }

    @When("^Luke attempts login using (.*) credentials (.*), (.*)$")
    public void login(String status, String userName, String password) {
        homePageSteps.login(userName,password);
    }

    @Then("^(.*) should (.*) Logged in$")
    public void verifyUserLogin(String userName,String status) {
       if(status.equalsIgnoreCase("be")){
            String welcomeMessage = "Hello "+userName;
            assertThat(welcomeMessage).isEqualToIgnoringCase(employeeDetailsSteps.getWelcomeMessage());
       }else{
           assertThat("Invalid username or password!").isEqualToIgnoringCase(homePageSteps.getErrorMessageOnLoginFailure());
       }
    }

}
