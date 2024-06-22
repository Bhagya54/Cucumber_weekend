
Feature: Learning tags in cucumber
@sanity
Scenario: Scenario one
Given launch browser
When login
Then login successful

@smoke
Scenario: Scenario two
Given launch browser
When sign up
Then sign up successful

@demo @sanity
Scenario: Scenario three
Given launch browser
When sign up
Then sign up successful

@smoke @demo
Scenario: Scenario four
Given launch browser
When sign up
Then sign up successful

@demo @sanity
Scenario: Scenario five
Given launch browser
When sign up
Then sign up successful

@smoke @sanity
Scenario: Scenario six
Given launch browser
When sign up
Then sign up successful

