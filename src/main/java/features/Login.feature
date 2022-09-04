@Function
Feature: Free CRM Login Feature

@First @Smoke @RegressionTest
Scenario: Free CRM Login Test Scenario

	Given User is already on Login Page
	When Title of Login Page is Free CRM
	Then User enters username and password		
	Then User clicks on Login Button
	Then User is on Home Page
	Then user close Browser 
 
@Second @RegressionTest @End2End
Scenario: Second Free CRM Login Test Scenario

	Given User is already on Login Page
	When Title of Login Page is Free CRM
	Then User enters username and password		
	Then User clicks on Login Button
	Then User is on Home Page
	Then user close Browser 
	
@Third @Smoke @End2End
Scenario: 3 Free CRM Login Test Scenario

	Given User is already on Login Page
	When Title of Login Page is Free CRM
	Then User enters username and password		
	Then User clicks on Login Button
	Then User is on Home Page
	Then user close Browser 