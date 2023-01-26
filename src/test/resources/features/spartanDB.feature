Feature: Spartan Name Information Test

  Scenario: Verify one spartan name
    When the user retrives the name of spartan with ID 8
    Then the name of the spartan should be "Rodolfo"


 Scenario Outline: Verify a list of Spartans name
    When the user retrives the name of spartan with ID <id>
    Then the name of the spartan should be "<name>"
    Examples:
    |id|name|
    |8 |Rodolfo|
    |2 |Nels   |
    |3 |Fidole |

