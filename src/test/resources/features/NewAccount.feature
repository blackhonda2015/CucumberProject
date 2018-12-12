Feature: US22123

Scenario: Successful new account creation

Given I open the browser
And I navigate to FreeCRM
When I am on FreeCRM site I click on signup
And I click on drop down menu and select Free Edition
And I fill in the new user information
And I click on the agree terms box
And I click on submit button
And I fill in the company name and number
And I click on continue button 
Then I successfully created new user