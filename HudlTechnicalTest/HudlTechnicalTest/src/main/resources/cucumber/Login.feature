Feature: Example of Testing the Login feature
  @Login @All
  Scenario: Accessing a the Login Page
    Given I am on the homepage
    And I access the Login Page
    When I add my login details
    Then I click the login button
