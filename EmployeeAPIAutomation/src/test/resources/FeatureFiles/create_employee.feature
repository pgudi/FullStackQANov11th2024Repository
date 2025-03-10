#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
@Execute
  Feature: Create Employee Functionality
    Scenario Outline: Validate Create Employee Functionality
      Given I provide Post Employee <Request> End Point
      And I create RequestSpecification object
      And I provide the Request Body
      And I provide header for the request
      And I enter request object to body method
      When I run the POST http Method
      Then I get the status code as 201
      And I store employeeId in a variable
      Given I provide Get Employee <Request> EndPoint
      And I create RequestSpecification object
      And I provide header for the request
      When I run the GET Http Method
      Then I get the status code as 200
      Given I provide Delete Employee <Request> EndPoint
      And I create RequestSpecification object
      And I provide header for the request
      When I run the DELETE Http Method
      Then I get the status code as 200

    Examples:
      | Request                                          |
      | http://localhost:9090/sgtesting/api/v1/employees |
