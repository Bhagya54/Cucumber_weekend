@google
Feature: Google Search Feature

Scenario: Validate the google search feature
Given Open the browser
And Navigate to google.com
When Entered a search keyword
And Hit the Enter button
Then Google search results appear
And Close the browser

