@VerifyUserIsLoggedOutOfTheApplication @Smoke @Regression
Feature: Logout of the Application
  As a user I should be able to logout of the application whenever required

  Scenario: Verify user is able to logout when required
    Given Luke is logged into the application
    When He try to Logout of the application
    Then He should land on Login view