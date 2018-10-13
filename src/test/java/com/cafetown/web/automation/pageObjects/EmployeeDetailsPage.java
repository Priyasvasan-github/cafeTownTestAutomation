package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by Sripriya Srinivasan on 10/13/2018.
 */
public class EmployeeDetailsPage extends BaseUtils {
    @FindBy(id="greetings")
    public WebElement welcomeMessage;

    @FindBy(className = "main-button")
    public WebElement logoutButton;

    @FindBy(id="bAdd")
    public WebElement createButton;

    @FindBy(id="bEdit")
    public WebElement editButton;

    @FindBy(id="bDelete")
    public WebElement deleteButton;

    @FindBy(id="employee-list")
    public WebElement employeeListTable;

    /**
     * This method fetches all the list of employees
     * @return
     */
    public List<WebElement> getEmployeeList(){
        List<WebElement> employeeList = employeeListTable.findElements(By.cssSelector(".ng-scope.ng-binding"));
        return employeeList;
    }

    /**
     * This Method returns welcome Message After Login
     * @return Welcome message as String
     */
    public String getWelcomeMessage(){
        return welcomeMessage.getText();
    }

    /**
     * This method is to click on logout button
     */
    public void clickLogoutButton(){
        logoutButton.click();
    }

    /**
     * This method is to click on Add button
     */
    public void clickAddButton(){
        createButton.click();
    }

    /**
     * This method is to Click on Edit button
     */
    public void clickEditButton(){
        editButton.click();
    }

    /**
     * This method is to click on delete button
     */
    public void clickDeleteButton(){
        deleteButton.click();
    }
}
