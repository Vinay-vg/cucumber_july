Feature: go to the login page

  Scenario: user navigates to login page
    Given user is on the login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage
