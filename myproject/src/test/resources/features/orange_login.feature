Feature: Login feature in Orange homepage

Scenario: Valid Login
Given User is on orange homepage
When User enter "Username" and "password"
And click on Login button
Then User should be navigate to dashboard

