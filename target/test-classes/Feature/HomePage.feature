Feature: Verifying Adactin Homepage
Scenario: verifying adactin login with valid credentials
Given User is in the Adactin Homepage
When User should enter Username and password
And User should click login button
Then User should check title second page and verify success