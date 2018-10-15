@Regression
Feature: Update employee Information
  As a user I should be able to update existing employee information as per the need

  Background:
    Given Luke is logged into the application

  @VerifyFirstNameOfTheEmployeeCanBeUpdated @Smoke
  Scenario: update first name details
    When He updates firstName of nameToEdit from nameToEdit to newEditedName
    Then His firstName of nameToEdit is updated to newEditedName

  @VerifyLastNameOfTheEmployeeCanBeUpdated
  Scenario: update Last name details
    When He updates lastName of newEditedName from lastUser to newLastUser
    Then His lastName of newEditedName is updated to newLastUser

  @VerifyStartDateOfTheEmployeeCanBeUpdated
  Scenario: update Start date details
    When He updates startDate of newEditedName from 1989-06-09 to 1988-08-08
    Then His startDate of newEditedName is updated to 1988-08-08

  @VerifyEmailOfTheEmployeeCanBeUpdated
  Scenario: update email details
    When He updates email of newEditedName from edit@test.cz to newEmail@test.com
    Then His email of newEditedName is updated to newEmail@test.com