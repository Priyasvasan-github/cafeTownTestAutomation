package com.cafetown.web.automation.pageMethods;

import com.cafetown.web.automation.pageObjects.EmployeeDetailsPage;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeListMethods {

    private EmployeeDetailsPage employeeDetailsPage;

    /**
     * This method Fetch the full name of the employee
     * @param index index of an employee in List
     * @param employeeList Full list of Employees
     * @return return full name of Employee from List
     */
    public String getEmployeeFullName(int index,List<WebElement>employeeList){
        return employeeList.get(index).getText();
    }

    /**
     * This method verifies if element exist and select the record
     * @param name Parameter of the employee tot search
     * @return return if employee exist or not
     */
    public boolean verifyIfEmployeeExist(String name) {
        List<WebElement> employeeList = employeeDetailsPage.getEmployeeList();
        int employeeCount = employeeList.size();
        if (employeeCount == 0) {
            //No proper message is displayed when there are no employees's so asserting back with count
             return false;
        } else {
            for (int paxCount = 0; paxCount < employeeCount; paxCount++) {
                if (getEmployeeFullName(paxCount,employeeList).contains(name)) {
                        employeeList.get(paxCount).click();
                    return true;
                } else if (paxCount == employeeCount - 1) {
                    return false;
                }
            }
        }
        return false;
    }
}
