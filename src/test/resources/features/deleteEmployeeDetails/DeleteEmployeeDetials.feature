Feature: Delete employee Information

  As a user I should also have permissions to delete existing employee Information

  @VerifyUserCanDeleteEmployeeInformation @Regression @Smoke
  Scenario: Delete user details
    Given Luke is logged into the application
    When He delete the employee details of FinaldelRecord!;
    Then User details of FinaldelRecord!; are Deleted
