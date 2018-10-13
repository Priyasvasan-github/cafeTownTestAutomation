package com.cafetown.web.automation.pageMethods;

import com.cafetown.web.automation.pageObjects.EmployeeDetailsPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeDetailsMethods {

    private EmployeeDetailsPage employeeDetailsPage;

    /**
     * This Method returns welcome Message After Login
     * @return Welcome message as String
     */
    @Step
    public String getWelcomeMessage(){
        return employeeDetailsPage.getWelcomeMessage();
    }

}
