Feature: Sign in

Scenario Outline: User is able to sign in using registered account

Given user is in suacedemo landing page
And user is able to see email and password input field
When user placed his or her <email> and <password>
And user clicks Login button
Then user is navigated to Products page
When user clicks burger icon
And clicks logout
Then user is navigated back to login page
And user close the application

Examples:
| email | password |
| standard_user | secret_sauce |
