Feature: Deal data creation

Scenario: Free CRM create a new deal

	Given User is already on login Page 
	When Title of Login Page is Free CRM
	Then User enters username and password	
	| username | password |
	| demo@techfios.com | abc123 |	
	Then User clicks on Login Button
	Then User is on Home Page
	Then user close Browser 