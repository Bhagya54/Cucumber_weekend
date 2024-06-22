Feature: Verify the login functionality
@smoke
Scenario: Test with valid credentials
Given user is on login page
When user enter valid username and password
And user clicked on login button
Then User is navigated to Home Screen

@sanity
Scenario: Test 2
Given user is on login page
When user enter invalid username and password
And user clicked on login button
Then User is navigated to Home Screen


