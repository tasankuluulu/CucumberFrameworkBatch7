Feature: login with invalid credentials

  Scenario: empty username
    Given go to HW HRMS login page
    When enter valid password only and login
    Then varify error message for empty username
    And HW quit the browser

  Scenario: empty password
    Given go to HRMS login page
    When enter valid username only and login
    Then varify error message for empty password
    And quit the browser
