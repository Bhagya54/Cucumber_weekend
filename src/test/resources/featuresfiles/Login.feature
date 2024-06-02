@login
Feature: Login Feature
Scenario: Validate login with valid credentials
Given Open the browser
And Navigated to gmail.com
When Entered valid username and password
And Clicked on Login button
Then Home screen is displayed
And Close the browser