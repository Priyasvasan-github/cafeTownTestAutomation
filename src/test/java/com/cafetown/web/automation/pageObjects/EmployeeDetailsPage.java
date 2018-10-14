package com.cafetown.web.automation.pageObjects;

import baseHelper.BaseUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @FindBy(id="employee-list")
    public WebElement employeeListTable;

    @FindBy(xpath="//button[contains(text(),'Add')]")
    public WebElement addButton;

    @FindBy(xpath="//button[contains(text(),'Update')]")
    public WebElement updateButton;

    @FindBy(xpath="//p[contains(text(),'Delete')]")
    public WebElement deleteCurrentRecordButton;

    /**
     * This method fetches all the list of employees
     * @return list of employees as WebElement List
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
     * Below click methods click on Various buttons on Employee Details view
     */
    public void clickLogoutButton(){
        logoutButton.click();
    }

    public void clickCreateButton(){
        createButton.click();
    }

    public void clickEditButton(){
            editButton.click();
    }

    public void clickUpdateButton(){
        updateButton.click();
    }

    /**
     * This method is to click on delete button
     */
    public void clickDeleteButton(){
        deleteCurrentRecordButton.click();
        handleAlertOnBrowser(ExpectedConditions.presenceOfElementLocated(By.id("bDelete")));
    }

    /**
     * This method handles the alerts if any on Browser
     */
    private void handleAlertOnBrowser(ExpectedCondition<WebElement> element) {
        try {
            this.waitFor(element);
        } catch (Exception e) {
            if (isAlertPresent()) {
                this.getAlert().accept();
            }
        }
    }

    /**
     * This method clicks on Add Button and wait for alerts to accept
     */
    public void clickAddButton(){
        addButton.click();
        handleAlertOnBrowser(ExpectedConditions.presenceOfElementLocated(By.id("bAdd")));
    }
}
