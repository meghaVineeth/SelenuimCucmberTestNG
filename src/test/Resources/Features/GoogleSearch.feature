Feature: Feature to test google search functionality
  Scenario: Validate google search is workimg
    Given browser is open
    And user is on google search page
    When User enters a text in the search box
    And user presses enter
    Then check search works on google