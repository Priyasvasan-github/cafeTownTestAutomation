# Serenity Cucumber POC project

This Project is a small POC of Serenity BDD framework using Selenium, java and cucumber

In this project I have performed testing on webapp(http://cafetownsend-angular-rails.herokuapp.com/login)

To test this web app I have Identified all the possible features that needs to tested and grouped the as below

# Login related features
		
		1) Login 
			    a)  Valid Login 
			    b) Invalid Login
		2) Logout
		
# Employee related features
		
		1) Add Employee
		2) Edit Employee
		3) View Employee 
		4) Delete Employee
		
To all the above functionalities created feature files and added them.

All the test cases here in the automation framework are added in BDD format. The reason for choosing tests to write in BDD format are as below

		1) Currently many teams are using BDD in SDLC as Acceptance criteria are very well available for both Development and testing
		2) Using BDD Acceptance test Will help the business understand the test cases very easily
		
# Testing Framework

I have used BDD Test Automation framework Using SerenityBDD. This serenity BDD is a library which uses Cucumber and selenium for its development. Below are the reasons for choosing this framework

		1) Easily maintainable automated acceptance criteria 
		2) Living documentation of test results
		3) Opensource tool with huge support Online
		


## How to Launch the tests

	# Pre-requisite: Maven is installed in the machine and configured properly
	
## 1) Using Maven

		Open a command window and run:

		WindowsOS:	mvn clean verify 

		MacOs : mvn clean verify -Dwebdriver.chrome.driver=DriverPathAsInput

	To Run Specific Tags of a test (Specific group of tests)

	  	mvn clean verify -Dcucumber.options="--tags @Regression"

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberTestSuite`
class tells JUnit to kick off Cucumber.

## 2) Using IDE
	Open the cloned project in IDE. Enable Auto-Import for Maven-dependency
	run Testrunner files in the path (src\test\java\com\cafetown\web\automation\testRunners)


## Test Result (View the reports)
Serenity BDD has one of the best reporting and the test reports are generated every time we execute the tests.

I have added sample test results here in the repository under folder **_`Final report After execution`_**

When the project is cloned into Local, test results reporting can be seen if we open **_`index.html`_** from Final report After execution folder.	
	
	
Kindly let me know if you need any further Information. You can contact me on my emailID.	
	





		
