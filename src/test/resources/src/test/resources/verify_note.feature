Feature: Verify the note created in the previous scenario

  Scenario: User opens the previously created note
    Given User is logged in
    When User opens the created note
    Then User should see the previously created note content