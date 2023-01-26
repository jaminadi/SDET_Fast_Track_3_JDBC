Feature: Checking UI and DB is matching

  @wip @db
  Scenario: Getting Data from UI part
    When the user navigates to spartan home page
    And the user clicks on view button for spartan with id 8
    Then the user should see that the name of the spartan is "Rodolfo"


  Scenario: Verify UI and DB information match
    When the user navigates to spartan home page
    And the user clicks on view button for spartan with id 4
    And the user retrieves the name of spartan with ID 4
    Then DB and UI info should match
