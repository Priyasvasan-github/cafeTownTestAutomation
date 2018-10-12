package com.cafetown.web.automation.testRunners.login;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Sripriya srinivasan on 10/12/2018.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login/Login.feature", glue = "com.cafetown.web.automation.stepDefinitions")
public class LoginFeatureTest {

}
