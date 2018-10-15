@Regression
Feature: Add employee information
  As a user I should be able to add employee Information

  Background:
    Given Luke is logged into the application

  @VerifyAddingUserSuccessfully @Smoke
  Scenario Outline: Add valid employee details
    When He attempts to add user with details <FirstName>, <LastName>, <DOB>, <EmailId>
    Then User details of <FirstName> are added successfully
    Examples:
      |FirstName          |  LastName  | DOB         |     EmailId     |
      | firstViewEmployee | Test User  | 1977-12-09  | user1@test.com  |
      | nameToEdit        | lastUser   | 1989-06-09  | edit@test.cz    |
      |FinaldelRecord!;   | R          | 1979-11-30  | user3@test.com  |
      | s                 | Shortname  | 1976-02-28  | user4@test.com  |

  @VerifyAddingUserIsNotSuccessfulAndAlertMessagesAreDisplayed
  Scenario Outline: Add invalid employee details
    When He attempts to add user with details <FirstName>, <LastName>, <DOB>, <EmailId>
    Then Employee is not created
  @EmptyLastNameTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | emptyLastName                                   |                  | 1977-12-09  | user1@test.com  |
  @EmptyFirstNameTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      |                                                 | emptyFirstName   | 1977-12-09  | user1@test.com  |
  @InvalidEmailTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | InvalidEmail                                    | R                | 1979-11-30  | user3test.com   |
  @WrongDateTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | InvalidDate Feb29in2017                         | test             | 2017-02-29  | user1@test.com  |
  @SpecialCharactersAsInputTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | s@123@#4                                        | SpecialCharacters| 1976-02-28  | user4@test.com  |
  @InjectJavaScriptAsInputTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      |<button onclick=alert('Test')>Click Here</button>|sc                | 1976-02-28  | user4@test.com  |
  @InvalidDateFormatTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | ChangedDateFormat                               | test             | 17-Mar-2018 | user1@test.com  |
  @WrongDateFormatExtraDataTest
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | ExtraValuesAfterDateFormat                      | test             | 1976-02-28et| user1@test.com  |
  @VeryLongFirstName
    Examples:
      |FirstName                                        |  LastName        | DOB         |     EmailId     |
      | ExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInputExtraLongStringAsInput                      | test             | 1976-02-28et| user1@test.com  |