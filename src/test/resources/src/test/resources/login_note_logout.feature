Feature:Login, write a note, and logout

  Scenario: User writes a note and logs out
    Given User is on the login page
    And User enters valid email and password
    When User clicks login button
    Then Note page is visible
    When User writes a new note
    Then Added note is Visible
    When User logs out
    Then User should be logged out successfully
