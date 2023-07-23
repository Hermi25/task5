Feature:Login, write a note, and logout

  Scenario: User writes a note and logs out
    Given User is on the login page
    And User enters valid email and password
    When User clicks login button
    Then User should be logged in successfully
    When User writes a new note
    And User logs out
    Then User should be logged out successfully