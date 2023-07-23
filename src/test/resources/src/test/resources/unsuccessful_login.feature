Feature: Unsuccessful login using email

  Scenario: User provides incorrect credentials
    Given User is on the login page
    And User enters invalid email
    When User clicks login button
    Then User should see an error message