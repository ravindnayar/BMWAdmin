Feature: Login 

@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch browser 
	When User opens URL "https://sandbox-thanksagain.mp.prime-cloud.com/" 
	And User clicks Signin button
	And User enters Email as "rishabh.puri@loyaltyprime.com" and Password as "Test@1234" 
	And Click on Login 
	Then Page Title should be "My Profile | Thanks Again"
	When User click on Log out link 
	Then Page Title should be "Home | Thanks Again" 
	And close browser 
	
@regression
Scenario Outline: Login Data Driven 
	Given User Launch browser 
	When User opens URL "https://sandbox-thanksagain.mp.prime-cloud.com/"
	And User clicks Signin button
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login 
	Then Page Title should be "My Profile | Thanks Again" 
	When User click on Log out link 
	Then Page Title should be "Home | Thanks Again"
	And close browser 
	
	Examples: 
		| email | password |
		| rishabh.puri@loyaltyprime.com	|	Test@1234 |