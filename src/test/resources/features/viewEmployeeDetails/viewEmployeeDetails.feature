@Regression
Feature: View employee Information
  As a user I should be able to edit existing employee information as per the need

  Background:
    Given Luke is logged into the application

  @VerifyUserCanViewEmployeeInformation @Smoke
  Scenario: View Existing employee details
    When He want to view the details of the firstViewEmployee, Test User
    Then User details are Displayed as firstViewEmployee, Test User, 1977-12-09, user1@test.com

  @VerifyUserCanViewEmployeeInformationWhenDoesNotExist
  Scenario: View Existing employee are not possible When record doesn't exist
    When He want to view the details of the employeeRecordNotFound
    Then User details of employeeRecordNotFound are not found