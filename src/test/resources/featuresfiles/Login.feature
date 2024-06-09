@login
Feature: Login Feature
Scenario Outline: Validate login with valid credentials
Given Open the browser
And Navigated to https://practicetestautomation.com/practice-test-login/
When Entered valid <username> and <password>
And Clicked on Login button
Then Home screen is displayed
And Close the browser

Examples:
|username|password|
|student|Password123|
|student1|Pass|
|student|Pasdasds|