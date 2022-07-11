Feature: I as a user need to list all employees

  Scenario: Validate that all employees are listed
    When querying the information of all employees
    Then response status code is 200
    And The service returns the names of employees such as Cedric Kelly, Herrod Chandler, Tiger Nixon



