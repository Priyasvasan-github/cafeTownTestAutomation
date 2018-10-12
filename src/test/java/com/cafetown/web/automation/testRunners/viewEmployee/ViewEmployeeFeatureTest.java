package com.cafetown.web.automation.testRunners.viewEmployee;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/viewEmployeeDetails/", glue = "com.cafetown.web.automation.stepDefinitions")
public class ViewEmployeeFeatureTest {
}
