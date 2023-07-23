Feature: Verify the note created in the previous scenario

  Scenario: User opens the previously created note
    Given User is on the login page
    And User enters valid email and password
    When User clicks login button
    Then Note page is visible
    When User opens the created note
    Then Added note is Visible