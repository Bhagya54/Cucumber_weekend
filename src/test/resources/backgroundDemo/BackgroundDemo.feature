Feature: Home screen validation
Background: user is on logged in
Given user is on login screen
When user enters username and password
And clicks on login button

Scenario: Logout tab verification
When clicked on username dashboard
Then Logout is displayed

Scenario: Admin tab verification
When clicked on Admin tab
Then Admin dashboard is displayed
