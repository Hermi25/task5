Feature:Successful login using email

  Scenario: User provides correct credentials
    Given User is on the login page
    And User enters valid email and password
    When User clicks login button
    Then User should be logged in successfully