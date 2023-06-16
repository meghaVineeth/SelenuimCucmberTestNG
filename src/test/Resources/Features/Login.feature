@smokescenario
Feature: Feature to test Login functionality

  @smoketest1
  Scenario: Check Login is successful with valid credentials
    Given user is on login page
    When user enters correct password
    And clicks on login button
    Then user navigates to the home page

  @smoketest2
  Scenario: Check Login is successful with valid credentials
    Given user is on login page
    When user enters correct password
    And clicks on login button
    Then user navigates to the home page