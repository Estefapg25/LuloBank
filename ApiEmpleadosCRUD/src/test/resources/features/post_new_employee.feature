Feature: I as a user need to create new employees

  Scenario: Validate new employee creation
    When the user sends the body of the request in the CreatePOSTEmployee json file to add new employee
    Then response status code is 200
    And the answer in the body is message Successfully

