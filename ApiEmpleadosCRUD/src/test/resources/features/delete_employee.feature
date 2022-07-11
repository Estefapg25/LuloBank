Feature: I as a user need to delete an employee

  Scenario Outline: Validate that it is allowed to delete an employee per id
    When I consult the information by
      | <id> |
    And information is removed by
      | <id> |
    Then response status code is 200
    And validate the id in response
      | <id> |


    Examples:
      | id |
      | 14 |



