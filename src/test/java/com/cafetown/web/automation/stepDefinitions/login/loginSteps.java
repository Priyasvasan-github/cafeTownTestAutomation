package com.cafetown.web.automation.stepDefinitions.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sripriya Srinivasan on 10/12/2018.
 */
public class loginSteps {

    @Given("^Luke is user accesing the portal$")
    public void accessThePortal() {

    }

    @When("^Luke attempts login using (.*) credentials (.*), (.*)$")
    public void login(String status, String userName, String password) {

    }

    @Then("^He should (.*) Logged in$")
    public void verifyUserLogin() {

    }

}
