Feature: Verify Login to Application

  As a user I should be logged in into the Application
  when i have provided valid credentials
  Also denied access when unable to prove my identity

  @VerifyUserLoginWithValidCredentials @Smoke @Regression
  Scenario: Verify user is able to login with correct credentials
    Given Luke is user accesing the portal
    When Luke attempts login using valid credentials Luke, Skywalker
    Then Luke should be Logged in

  @VerifyUserLoginWithInValidCredentials @Regression
  Scenario: Verify user is not able to login with Invalid credentials
    Given Luke is user accesing the portal
    When Luke attempts login using Invalid credentials Luke, invalidPassword
    Then Luke should not be Logged in
