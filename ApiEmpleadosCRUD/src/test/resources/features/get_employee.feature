Feature: I as a user need to obtain an employee by name

  Scenario Outline: Validate that the information of the consulted employee is correct.
    When I consult the information by
      | <id> |
    Then response status code is 200
    And validate the age 59 años and name employee Herrod Chandler in the response


    Examples:
      | id |
      | 7  |



